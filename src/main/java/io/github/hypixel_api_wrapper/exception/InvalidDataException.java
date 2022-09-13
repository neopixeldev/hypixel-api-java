package io.github.hypixel_api_wrapper.exception;

/**
 * Some data provided is invalid.
 */
public class InvalidDataException extends NeopixelException {
    public InvalidDataException(String message) {
        super(message);
    }
}
