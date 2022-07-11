package io.github.hypixel_api_wrapper.wrapper.games.duels;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelDuels extends HypixelGame {

    protected HypixelDuels(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "DUELS";
    }

    @Override
    public String getGameName() {
        return "Duels";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
