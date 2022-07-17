package io.github.hypixel_api_wrapper.wrapper.games.classic.walls;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelWalls extends HypixelGame {

    protected HypixelWalls(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "WALLS";
    }

    @Override
    public String getGameName() {
        return "Walls";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
