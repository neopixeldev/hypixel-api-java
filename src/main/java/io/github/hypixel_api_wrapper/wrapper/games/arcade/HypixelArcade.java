package io.github.hypixel_api_wrapper.wrapper.games.arcade;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelArcade extends HypixelGame {

    protected HypixelArcade(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "ARCADE";
    }

    @Override
    public String getGameName() {
        return "Arcade";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
