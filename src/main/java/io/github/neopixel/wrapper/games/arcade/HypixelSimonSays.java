package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelSimonSays extends HypixelGame {

    protected HypixelSimonSays(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "SIMON_SAYS";
    }

    @Override
    public String getGameName() {
        return "Simon Says";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getRounds() {
        return jsonHandler.getSafeInt("rounds_simon_says");
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins_simon_says");
    }

    public int getTopScore() {
        return jsonHandler.getSafeInt("top_score_simon_says");
    }
}
