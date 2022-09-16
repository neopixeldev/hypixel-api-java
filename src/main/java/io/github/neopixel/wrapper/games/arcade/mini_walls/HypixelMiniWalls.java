package io.github.neopixel.wrapper.games.arcade.mini_walls;

import io.github.neopixel.wrapper.games.arcade.HypixelArcade;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelMiniWalls extends HypixelArcade {

    protected HypixelMiniWalls(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
