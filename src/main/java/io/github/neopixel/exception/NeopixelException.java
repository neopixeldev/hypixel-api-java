package io.github.neopixel.exception;

public class NeopixelException extends RuntimeException {

    private final String message;

    public NeopixelException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "NeoException: " +
            "API response = '" + message + '\'';
    }
}
