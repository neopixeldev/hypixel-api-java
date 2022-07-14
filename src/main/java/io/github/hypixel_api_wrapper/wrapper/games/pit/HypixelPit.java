package io.github.hypixel_api_wrapper.wrapper.games.pit;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelPit extends HypixelGame {

    protected HypixelPit(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "PIT";
    }

    @Override
    public String getGameName() {
        return "Pit";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
