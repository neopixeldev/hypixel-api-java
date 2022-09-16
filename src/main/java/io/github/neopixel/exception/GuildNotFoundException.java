package io.github.neopixel.exception;

/**
 * A guild is not found in the API.
 */

public class GuildNotFoundException extends NeopixelException {
    public GuildNotFoundException(String message) {
        super(message);
    }
}
