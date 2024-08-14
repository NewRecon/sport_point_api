package com.example.profile_service.exception.handler;

import com.example.profile_service.exception.ProfileException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ProfileExceptionHandler {

    @ExceptionHandler(ProfileException.class)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public String handleException(ProfileException exception) {
        return exception.getMessage();
    }
}
