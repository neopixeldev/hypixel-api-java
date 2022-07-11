package io.github.hypixel_api_wrapper.wrapper.games.classic.vampireZ;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelVampireZ extends HypixelGame {

    protected HypixelVampireZ(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "VAMPIREZ";
    }

    @Override
    public String getGameName() {
        return "VampireZ";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
