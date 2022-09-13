package io.github.neopixel.wrapper.games.mega_walls;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelMegaWalls extends HypixelGame {

    protected HypixelMegaWalls(JSONHandler jsonHandler) {
        super(jsonHandler);
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
