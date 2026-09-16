package com.exceptions;

public class InvalidPersonNameException extends RuntimeException {
    public InvalidPersonNameException(String message) {
        super("El nombre de la persona no es valido.");
    }
}
