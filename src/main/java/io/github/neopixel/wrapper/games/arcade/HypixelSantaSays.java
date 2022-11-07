package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelSantaSays extends HypixelGame {

    protected HypixelSantaSays(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "SANTA_SAYS";
    }

    @Override
    public String getGameName() {
        return "Santa Says";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getRoundWins() {
        return jsonHandler.getSafeInt("round_wins_santa_says");
    }

    public int getTopScore() {
        return jsonHandler.getSafeInt("top_score_santa_says");
    }
}
