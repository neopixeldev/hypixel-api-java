package io.github.neopixel.wrapper.games.skyblock;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelSkyblock extends HypixelGame {

    protected HypixelSkyblock(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "SKYBLOCK";
    }

    @Override
    public String getGameName() {
        return "SkyBlock";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
