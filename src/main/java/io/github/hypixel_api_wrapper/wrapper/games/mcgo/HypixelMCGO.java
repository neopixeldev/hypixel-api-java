package io.github.hypixel_api_wrapper.wrapper.games.mcgo;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelMCGO extends HypixelGame {

    protected HypixelMCGO(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "MCGO";
    }

    @Override
    public String getGameName() {
        return "Cops and Crims";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
