package io.github.hypixel_api_wrapper.wrapper.games.skyclash;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelSkyClash extends HypixelGame {

    protected HypixelSkyClash(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "SKYCLASH";
    }

    @Override
    public String getGameName() {
        return "SkyClash";
    }

    @Override
    public boolean isRemoved() {
        return true;
    }
}
