package io.github.hypixel_api_wrapper.exception;

/**
 * A guild is not found in the API.
 */
public class GuildNotFoundException extends NovopixelException {

    public GuildNotFoundException(String message) {
        super(message);
    }
}
