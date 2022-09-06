package io.github.hypixel_api_wrapper.wrapper.games.classic.paintball;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import org.json.JSONObject;

public class HypixelPaintball extends HypixelGame {

    protected HypixelPaintball(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "PAINTBALL";
    }

    @Override
    public String getGameName() {
        return "Paintball";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
