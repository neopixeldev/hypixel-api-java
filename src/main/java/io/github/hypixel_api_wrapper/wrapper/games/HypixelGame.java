package io.github.hypixel_api_wrapper.wrapper.games;

import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;

public abstract class HypixelGame {

    protected final JSONHandler jsonHandler;

    protected HypixelGame(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    public abstract String getGameID();

    public abstract String getGameName();

    /*
        @return whether the game has been removed from the Hypixel Network.
     */
    public abstract boolean isRemoved();
}
