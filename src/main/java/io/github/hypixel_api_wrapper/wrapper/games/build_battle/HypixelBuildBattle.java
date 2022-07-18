package io.github.hypixel_api_wrapper.wrapper.games.build_battle;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelBuildBattle extends HypixelGame {

    protected HypixelBuildBattle(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "BUILD_BATTLE";
    }

    @Override
    public String getGameName() {
        return "Build Battle";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
