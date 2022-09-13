package io.github.neopixel.wrapper.games.skyclash;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelSkyClash extends HypixelGame {

    protected HypixelSkyClash(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "SKYCLASH";
    }

    @Override
    public String getGameName() {
        return "SkyClash";
    }

    @Override
    public boolean isRemoved() {
        return true;
    }
}
