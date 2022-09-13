package io.github.neopixel.wrapper.games.classic.walls;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelWalls extends HypixelGame {

    protected HypixelWalls(JSONHandler jsonHandler) {
        super(jsonHandler);
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
