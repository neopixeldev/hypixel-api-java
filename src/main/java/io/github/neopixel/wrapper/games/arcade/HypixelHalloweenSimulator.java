package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelHalloweenSimulator extends HypixelGame {

    protected HypixelHalloweenSimulator(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "HALLOWEEN_SIMULATOR";
    }

    @Override
    public String getGameName() {
        return "Halloween Simulator";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getCandyFound() {
        return jsonHandler.getSafeInt("candy_found_halloween_simulator");
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins_halloween_simulator");
    }
}
