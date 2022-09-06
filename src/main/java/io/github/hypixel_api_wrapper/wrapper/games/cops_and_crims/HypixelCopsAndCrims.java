package io.github.hypixel_api_wrapper.wrapper.games.cops_and_crims;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import org.json.JSONObject;

public class HypixelCopsAndCrims extends HypixelGame {

    protected HypixelCopsAndCrims(JSONHandler jsonHandler) {
        super(jsonHandler);
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
