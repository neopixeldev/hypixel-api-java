package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelEnderSpleef extends HypixelGame {

    protected HypixelEnderSpleef(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "ENDER_SPLEEF";
    }

    @Override
    public String getGameName() {
        return "Ender Spleef";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public String getTrail() {
        return jsonHandler.getSafeString("enderspleef_trail");
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
