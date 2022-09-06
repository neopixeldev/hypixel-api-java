package io.github.hypixel_api_wrapper.wrapper.games.murder_mystery;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import org.json.JSONObject;

public class HypixelMurderMystery extends HypixelGame {

    protected HypixelMurderMystery(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "MURDER_MYSTERY";
    }

    @Override
    public String getGameName() {
        return "Murder Mystery";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
