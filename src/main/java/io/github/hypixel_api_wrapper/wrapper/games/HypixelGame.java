package io.github.hypixel_api_wrapper.wrapper.games;

import org.json.JSONObject;

public abstract class HypixelGame {

    protected final JSONObject stats;

    protected HypixelGame(JSONObject stats) {
        this.stats = stats;
    }

    public abstract String getGameID();

    public abstract String getGameName();

    /*
        @return whether the game has been removed from the Hypixel Network.
     */
    public abstract boolean isRemoved();
}
