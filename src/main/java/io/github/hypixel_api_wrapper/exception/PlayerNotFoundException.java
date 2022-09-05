package io.github.hypixel_api_wrapper.exception;

/**
 * A player is not found in the API.
 */
public class PlayerNotFoundException extends NovopixelException {

    public PlayerNotFoundException(String message) {
        super(message);
    }
}
