package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelGrinchSimulator extends HypixelGame {

    protected HypixelGrinchSimulator(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "GRINCH_SIMULATOR";
    }

    @Override
    public String getGameName() {
        return "Grinch Simulator";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getPresentsStolen() {
        return jsonHandler.getSafeInt("gifts_grinch_simulator_v2");
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins_grinch_simulator_v2");
    }
}
