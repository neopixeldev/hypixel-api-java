package io.github.hypixel_api_wrapper.wrapper.games.housing;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import org.json.JSONObject;

public class HypixelHousing extends HypixelGame {

    protected HypixelHousing(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "HOUSING";
    }

    @Override
    public String getGameName() {
        return "Housing";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
