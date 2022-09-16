package io.github.neopixel.wrapper.games.classic.arena_brawl;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelArenaBrawl extends HypixelGame {

    protected HypixelArenaBrawl(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "ARENA";
    }

    @Override
    public String getGameName() {
        return "Arena Brawl";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
