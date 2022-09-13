package io.github.neopixel.wrapper.games.classic.vampirez;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelVampireZ extends HypixelGame {

    protected HypixelVampireZ(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "VAMPIREZ";
    }

    @Override
    public String getGameName() {
        return "VampireZ";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
