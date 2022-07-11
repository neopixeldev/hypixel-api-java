package io.github.hypixel_api_wrapper.wrapper.games.classic.walls;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelWalls3 extends HypixelGame {

    protected HypixelWalls3(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "WALLS3";
    }

    @Override
    public String getGameName() {
        return "Mega Walls";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
