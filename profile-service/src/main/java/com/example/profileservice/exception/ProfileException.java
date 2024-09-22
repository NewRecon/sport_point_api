package com.example.profileservice.exception;

public class ProfileException extends RuntimeException {

    public ProfileException(ErrorType errorType) {
        super(errorType.getMessage());
    }
}
