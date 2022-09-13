package io.github.neopixel.wrapper.games.classic;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelClassicGames extends HypixelGame {

    protected HypixelClassicGames(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "LEGACY";
    }

    @Override
    public String getGameName() {
        return "Classic Games";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
