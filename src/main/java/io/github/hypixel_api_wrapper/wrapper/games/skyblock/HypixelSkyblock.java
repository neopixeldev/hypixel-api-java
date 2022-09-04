package io.github.hypixel_api_wrapper.wrapper.games.skyblock;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import org.json.JSONObject;

public class HypixelSkyblock extends HypixelGame {

    protected HypixelSkyblock(JSONHandler jsonHandler) {
        super(jsonHandler);
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
