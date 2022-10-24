package io.github.neopixel.wrapper.games.uhc;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelUHCRedVSBlue extends HypixelGame {

    protected HypixelUHCRedVSBlue(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "UHC_RED_VS_BLUE";
    }

    @Override
    public String getGameName() {
        return "UHC Red vs Blue";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
