package io.github.neopixel.exception;

/**
 * Some data provided is invalid.
 */
public class InvalidDataException extends NeopixelException {
    public InvalidDataException(String message) {
        super(message);
    }
}
