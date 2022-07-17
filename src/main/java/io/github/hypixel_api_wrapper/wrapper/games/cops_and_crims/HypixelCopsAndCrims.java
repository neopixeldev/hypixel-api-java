package io.github.hypixel_api_wrapper.wrapper.games.cops_and_crims;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelCopsAndCrims extends HypixelGame {

    protected HypixelCopsAndCrims(JSONObject stats) {
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
