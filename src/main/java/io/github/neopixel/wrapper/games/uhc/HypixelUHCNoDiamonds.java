package io.github.neopixel.wrapper.games.uhc;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelUHCNoDiamonds extends HypixelGame {

    protected HypixelUHCNoDiamonds(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "UHC_NO_DIAMONDS";
    }

    @Override
    public String getGameName() {
        return "UHC No Diamonds";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
