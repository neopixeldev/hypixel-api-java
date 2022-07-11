package io.github.hypixel_api_wrapper.wrapper.games.skywars;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelSkyWars extends HypixelGame {

    protected HypixelSkyWars(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "SKYWARS";
    }

    @Override
    public String getGameName() {
        return "SkyWars";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
