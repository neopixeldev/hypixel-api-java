package io.github.hypixel_api_wrapper.wrapper.games.uhc;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelSpeedUHC extends HypixelGame {

    protected HypixelSpeedUHC(JSONObject stats) {
        super(stats);
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
