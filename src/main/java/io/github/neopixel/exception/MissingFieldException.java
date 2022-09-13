package io.github.neopixel.exception;

/**
 * Some data is missing, usually a field.
 */

public class MissingFieldException extends NeopixelException {
    public MissingFieldException(String message) {
        super(message);
    }
}
