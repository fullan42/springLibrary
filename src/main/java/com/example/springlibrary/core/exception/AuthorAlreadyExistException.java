package com.example.springlibrary.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class AuthorAlreadyExistException extends RuntimeException {
    public AuthorAlreadyExistException(String message) {
        super(message);
    }
}
