package io.github.neopixel.wrapper.games.smash_heroes;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelSmashHeroes extends HypixelGame {

    protected HypixelSmashHeroes(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "SUPER_SMASH";
    }

    @Override
    public String getGameName() {
        return "Smash Heroes";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
