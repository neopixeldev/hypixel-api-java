package io.github.neopixel.exception;

public class NovopixelException extends RuntimeException {

    private final String message;

    public NovopixelException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "NovopixelException: " +
            "API response = '" + message + '\'';
    }
}
