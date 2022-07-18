package io.github.hypixel_api_wrapper.wrapper.games.classic.quake;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelQuake extends HypixelGame {

    protected HypixelQuake(JSONObject stats) {
        super(stats);
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
