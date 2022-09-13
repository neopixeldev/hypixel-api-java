package io.github.hypixel_api_wrapper.exception;

/**
 * Other exceptions from the API that have not been handled.
 */

public class UnknownAPIException extends NeopixelException {
    public UnknownAPIException(String message) {
        super(message);
    }
}
