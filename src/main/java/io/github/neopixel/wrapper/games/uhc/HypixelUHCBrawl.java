package io.github.neopixel.wrapper.games.uhc;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelUHCBrawl extends HypixelGame {

    protected HypixelUHCBrawl(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "UHC_BRAWL";
    }

    @Override
    public String getGameName() {
        return "UHC Brawl";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
