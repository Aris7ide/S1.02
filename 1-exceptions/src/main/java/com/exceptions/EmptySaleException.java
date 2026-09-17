package com.exceptions;

public class EmptySaleException extends RuntimeException {

        public EmptySaleException () {
            super("Para hacer una venta primero debes añadir productos");
        }

}
