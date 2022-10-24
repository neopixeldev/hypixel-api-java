package io.github.neopixel.wrapper.games.uhc;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelUHCDuoBrawl extends HypixelGame {

    protected HypixelUHCDuoBrawl(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "UHC_BRAWL_DOUBLES";
    }

    @Override
    public String getGameName() {
        return "UHC Duo Brawl";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
