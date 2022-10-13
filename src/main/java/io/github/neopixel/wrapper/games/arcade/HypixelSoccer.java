package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelSoccer extends HypixelGame {

    protected HypixelSoccer(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "SOCCER";
    }

    @Override
    public String getGameName() {
        return "Soccer";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins_soccer");
    }

    public int getGoals() {
        return jsonHandler.getSafeInt("goals_soccer");
    }

    public int getKicks() {
        return jsonHandler.getSafeInt("kicks_soccer");
    }

    public int getPowerKicks() {
        return jsonHandler.getSafeInt("powerkicks_soccer");
    }
}
