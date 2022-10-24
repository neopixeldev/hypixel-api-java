package io.github.neopixel.wrapper.games.uhc;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelUHCSolos extends HypixelGame {

    protected HypixelUHCSolos(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "UHC_SOLOS";
    }

    @Override
    public String getGameName() {
        return "UHC Solos";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
