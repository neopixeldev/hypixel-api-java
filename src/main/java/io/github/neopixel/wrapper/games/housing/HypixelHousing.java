package io.github.neopixel.wrapper.games.housing;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelHousing extends HypixelGame {

    protected HypixelHousing(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "HOUSING";
    }

    @Override
    public String getGameName() {
        return "Housing";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
