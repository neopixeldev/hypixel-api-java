package io.github.neopixel.wrapper.games.wool_games;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelWoolGames extends HypixelGame {

    protected HypixelWoolGames(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "WoolGames";
    }

    @Override
    public String getGameName() {
        return "Wool Games";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    /**
     * @return The amount of coins that the player has.
     */
    public int getCoins() {
        return jsonHandler.getSafeInt("coins");
    }
}
