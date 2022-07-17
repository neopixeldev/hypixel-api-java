package io.github.hypixel_api_wrapper.wrapper.games.blitz;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelBlitzSurvival extends HypixelGame {

    protected HypixelBlitzSurvival(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "SURVIVAL_GAMES";
    }

    @Override
    public String getGameName() {
        return "Blitz Survival Games";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
