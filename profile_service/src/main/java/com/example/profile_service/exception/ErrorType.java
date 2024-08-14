package com.example.profile_service.exception;

public enum ErrorType {
    PROFILE_NOT_FOUND("Profile not found");

    private final String message;

    private ErrorType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
