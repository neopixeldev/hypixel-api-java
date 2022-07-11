package io.github.hypixel_api_wrapper.wrapper.games.super_smash;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelSuperSmash extends HypixelGame {

    protected HypixelSuperSmash(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "SUPER_SMASH";
    }

    @Override
    public String getGameName() {
        return "Smash Heros";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
