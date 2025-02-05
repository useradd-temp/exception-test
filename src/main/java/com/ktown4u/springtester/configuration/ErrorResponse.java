package com.ktown4u.springtester.configuration;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ErrorResponse {

    private final LocalDateTime timestamp;
    private final int status;
    private final String message;


    public ErrorResponse(int status, String error) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.message = error;
    }
}
