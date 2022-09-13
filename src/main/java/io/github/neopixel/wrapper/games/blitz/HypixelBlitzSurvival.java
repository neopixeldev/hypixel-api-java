package io.github.neopixel.wrapper.games.blitz;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelBlitzSurvival extends HypixelGame {

    protected HypixelBlitzSurvival(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "SURVIVAL_GAMES";
    }

    @Override
    public String getGameName() {
        return "Blitz Survival Games";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
