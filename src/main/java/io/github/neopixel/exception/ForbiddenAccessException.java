package io.github.neopixel.exception;

/**
 * Access is forbidden, usually due to an invalid API key being used.
 */

public class ForbiddenAccessException extends NeopixelException {
    public ForbiddenAccessException(String message) {
        super(message);
    }
}
