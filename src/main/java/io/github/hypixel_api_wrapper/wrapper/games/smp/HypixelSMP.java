package io.github.hypixel_api_wrapper.wrapper.games.smp;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelSMP extends HypixelGame {

    protected HypixelSMP(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "SMP";
    }

    @Override
    public String getGameName() {
        return "SMP";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
