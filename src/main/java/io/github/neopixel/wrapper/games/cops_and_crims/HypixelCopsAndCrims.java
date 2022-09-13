package io.github.neopixel.wrapper.games.cops_and_crims;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelCopsAndCrims extends HypixelGame {

    protected HypixelCopsAndCrims(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "MCGO";
    }

    @Override
    public String getGameName() {
        return "Cops and Crims";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
