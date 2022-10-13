package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelEnder extends HypixelGame {

    protected HypixelEnder(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "ENDER";
    }

    @Override
    public String getGameName() {
        return "Ender";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins_ender");
    }

    public int getBigShotPowerupActivations() {
        return jsonHandler.getSafeInt("bigshot_powerup_activations_ender");
    }

    public int getBlocksDestroyed() {
        return jsonHandler.getSafeInt("blocks_destroyed_ender");
    }

    public int getPowerupActivations() {
        return jsonHandler.getSafeInt("powerup_activations_ender");
    }

    public int getTripleShotPowerupActivations() {
        return jsonHandler.getSafeInt("tripleshot_powerup_activations_ender");
    }
}
