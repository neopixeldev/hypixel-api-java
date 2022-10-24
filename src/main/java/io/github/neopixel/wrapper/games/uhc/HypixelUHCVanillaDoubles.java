package io.github.neopixel.wrapper.games.uhc;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelUHCVanillaDoubles extends HypixelGame {

    protected HypixelUHCVanillaDoubles(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "UHC_VANILLA_DOUBLES";
    }

    @Override
    public String getGameName() {
        return "UHC Vanilla Doubles";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
