package io.github.hypixel_api_wrapper.wrapper.games.classic.quake;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import org.json.JSONObject;

public class HypixelQuake extends HypixelGame {

    protected HypixelQuake(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "QUAKECRAFT";
    }

    @Override
    public String getGameName() {
        return "Quake";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
