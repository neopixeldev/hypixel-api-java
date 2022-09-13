package io.github.neopixel.wrapper.games;

import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelReplay extends HypixelGame {

    protected HypixelReplay(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "REPLAY";
    }

    @Override
    public String getGameName() {
        return "Replay";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
