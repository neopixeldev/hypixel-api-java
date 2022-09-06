package io.github.hypixel_api_wrapper.wrapper.games.arcade.mini_walls;

import io.github.hypixel_api_wrapper.wrapper.games.arcade.HypixelArcade;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import org.json.JSONObject;

public class HypixelMiniWalls extends HypixelArcade {

    protected HypixelMiniWalls(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
