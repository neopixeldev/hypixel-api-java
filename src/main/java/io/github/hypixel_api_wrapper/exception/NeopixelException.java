package io.github.hypixel_api_wrapper.exception;

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
        return "NovopixelException: " +
            "API response = '" + message + '\'';
    }
}
