package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelOneInTheQuiver extends HypixelGame {

    protected HypixelOneInTheQuiver(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "ONE_IN_THE_QUIVER";
    }

    @Override
    public String getGameName() {
        return "One In The Quiver";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins_oneinthequiver");
    }

    public int getKills() {
        return jsonHandler.getSafeInt("kills_oneinthequiver");
    }

    public int getDeaths() {
        return jsonHandler.getSafeInt("deaths_oneinthequiver");
    }

    public int getBountyKills() {
        return jsonHandler.getSafeInt("bounty_kills_oneinthequiver");
    }
}
