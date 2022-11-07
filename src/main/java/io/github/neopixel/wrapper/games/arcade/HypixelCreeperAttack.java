package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelCreeperAttack extends HypixelGame {

    protected HypixelCreeperAttack(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "CREEPER_ATTACK";
    }

    @Override
    public String getGameName() {
        return "Creeper Attack";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getMaxWave() {
        return jsonHandler.getSafeInt("max_wave");
    }
}
