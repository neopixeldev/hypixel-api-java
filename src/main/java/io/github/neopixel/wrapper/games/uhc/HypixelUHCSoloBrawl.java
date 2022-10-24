package io.github.neopixel.wrapper.games.uhc;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelUHCSoloBrawl extends HypixelGame {

    protected HypixelUHCSoloBrawl(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "UHC_BRAWL_SOLOS";
    }

    @Override
    public String getGameName() {
        return "Uhc Brawl Solos";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
