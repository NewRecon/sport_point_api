package com.example.profile_service.exception;

public class ProfileException extends RuntimeException {

    public ProfileException(ErrorType errorType) {
        super(errorType.getMessage());
    }
}
