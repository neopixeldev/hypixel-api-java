package io.github.neopixel.wrapper.games.murder_mystery;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelMurderMystery extends HypixelGame {

    protected HypixelMurderMystery(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "MURDER_MYSTERY";
    }

    @Override
    public String getGameName() {
        return "Murder Mystery";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
