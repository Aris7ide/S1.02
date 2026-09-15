package com.exceptions;

public class InvalidStringLength extends RuntimeException {
    public InvalidStringLength(String message) {
        super(message);
    }
}
