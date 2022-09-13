package io.github.neopixel.wrapper.games.uhc;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelSpeedUHC extends HypixelGame {

    protected HypixelSpeedUHC(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "SPEED_UHC";
    }

    @Override
    public String getGameName() {
        return "Speed UHC";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
