package io.github.hypixel_api_wrapper.exception;

/**
 * Some data is missing, usually a field.
 */
public class MissingFieldException extends NeopixelException {

    public MissingFieldException(String message) {
        super(message);
    }
}
