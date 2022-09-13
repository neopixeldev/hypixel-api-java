package io.github.neopixel.wrapper.games.classic.paintball;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelPaintball extends HypixelGame {

    protected HypixelPaintball(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "PAINTBALL";
    }

    @Override
    public String getGameName() {
        return "Paintball";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
