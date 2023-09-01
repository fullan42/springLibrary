package com.example.springlibrary.core.exception;


public class BookAlreadyExistException extends RuntimeException {
    public BookAlreadyExistException(String message){
        super(message);
    }
}
