package io.github.neopixel.wrapper.games.warlords;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelWarlords extends HypixelGame {

    protected HypixelWarlords(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "BATTLEGROUND";
    }

    @Override
    public String getGameName() {
        return "Warlords";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
