package io.github.neopixel.wrapper.games.crazy_walls;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelCrazyWalls extends HypixelGame {

    protected HypixelCrazyWalls(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "TRUE_COMBAT";
    }

    @Override
    public String getGameName() {
        return "TrueCombat";
    }

    @Override
    public boolean isRemoved() {
        return true;
    }
}
