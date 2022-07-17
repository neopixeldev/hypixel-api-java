package io.github.hypixel_api_wrapper.wrapper.games.arcade.mini_walls;

import io.github.hypixel_api_wrapper.wrapper.games.arcade.HypixelArcade;
import org.json.JSONObject;

public class HypixelMiniWalls extends HypixelArcade {

    protected HypixelMiniWalls(JSONObject stats) {
        super(stats);
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
