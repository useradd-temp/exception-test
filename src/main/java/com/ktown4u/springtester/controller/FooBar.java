package com.ktown4u.springtester.controller;

import com.ktown4u.springtester.exception.FooException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FooBar {

    @GetMapping("/foo")
    public String foo() throws FooException {
        throw new FooException("foo");
    }

    @GetMapping("/bar")
    public ResponseEntity bar() {
        try {
            this.throwException();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("exception");
        }
        return ResponseEntity.status(HttpStatus.OK).body("NEVER RETURNED");
    }

    private void throwException() throws Exception {
        throw new Exception();
    }
}
