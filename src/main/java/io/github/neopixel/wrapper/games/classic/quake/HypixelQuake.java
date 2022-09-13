package io.github.neopixel.wrapper.games.classic.quake;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelQuake extends HypixelGame {

    protected HypixelQuake(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "QUAKECRAFT";
    }

    @Override
    public String getGameName() {
        return "Quake";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
