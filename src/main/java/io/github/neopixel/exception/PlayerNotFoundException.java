package io.github.neopixel.exception;

/**
 * A player is not found in the API.
 */
 
public class PlayerNotFoundException extends NeopixelException {
    public PlayerNotFoundException(String message) {
        super(message);
    }
}
