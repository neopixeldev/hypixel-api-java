package io.github.neopixel.wrapper.games.tnt_games;

import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelTNTGames {

    private final JSONHandler jsonHandler;

    protected HypixelTNTGames(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins");
    }

    public int getDeaths() {
        return jsonHandler.getSafeInt("deaths");
    }
}
