package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelBountyHunters extends HypixelGame {

    protected HypixelBountyHunters(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "BOUNTY_HUNTERS";
    }

    @Override
    public String getGameName() {
        return "Bounty Hunters";
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
