package io.github.neopixel.wrapper.games.uhc;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelUHCTeams extends HypixelGame {

    protected HypixelUHCTeams(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "UHC_TEAMS";
    }

    @Override
    public String getGameName() {
        return "UHC Teams";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
