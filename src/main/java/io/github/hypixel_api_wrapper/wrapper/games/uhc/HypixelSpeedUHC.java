package io.github.hypixel_api_wrapper.wrapper.games.uhc;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import org.json.JSONObject;

public class HypixelSpeedUHC extends HypixelGame {

    protected HypixelSpeedUHC(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "SPEED_UHC";
    }

    @Override
    public String getGameName() {
        return "Speed UHC";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
