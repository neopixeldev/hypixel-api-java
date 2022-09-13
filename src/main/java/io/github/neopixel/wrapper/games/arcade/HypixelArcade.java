package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelArcade extends HypixelGame {

    protected HypixelArcade(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "ARCADE";
    }

    @Override
    public String getGameName() {
        return "Arcade";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
