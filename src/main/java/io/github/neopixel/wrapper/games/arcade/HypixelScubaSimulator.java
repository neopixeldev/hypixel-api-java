package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelScubaSimulator extends HypixelGame {

    protected HypixelScubaSimulator(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "SCUBA_SIMULATOR";
    }

    @Override
    public String getGameName() {
        return "Scuba Simulator";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getItemsFound() {
        return jsonHandler.getSafeInt("items_found_scuba_simulator");
    }

    public int getTotalPoints() {
        return jsonHandler.getSafeInt("total_points_scuba_simulator");
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins_scuba_simulator");
    }
}
