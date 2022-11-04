package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelEasterSimulator extends HypixelGame {

    protected HypixelEasterSimulator(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "EASTER_SIMULATOR";
    }

    @Override
    public String getGameName() {
        return "Easter Simulator";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getEggsFound() {
        return jsonHandler.getSafeInt("eggs_found_easter_simulator");
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins_easter_simulator");
    }
}
