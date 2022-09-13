package io.github.neopixel.wrapper.games.pit;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelPit extends HypixelGame {

    protected HypixelPit(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "PIT";
    }

    @Override
    public String getGameName() {
        return "Pit";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
