package com.exceptions;

public class InvalidCharLength extends RuntimeException {
    public InvalidCharLength(String message) {
        super(message);
    }
}
