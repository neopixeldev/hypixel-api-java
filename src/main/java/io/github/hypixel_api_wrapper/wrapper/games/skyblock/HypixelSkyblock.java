package io.github.hypixel_api_wrapper.wrapper.games.skyblock;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelSkyblock extends HypixelGame {

    protected HypixelSkyblock(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "SKYBLOCK";
    }

    @Override
    public String getGameName() {
        return "SkyBlock";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
