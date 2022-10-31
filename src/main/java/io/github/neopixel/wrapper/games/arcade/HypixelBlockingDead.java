package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelDayOne extends HypixelGame {

    protected HypixelDayOne(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "DAY_ONE";
    }

    @Override
    public String getGameName() {
        return "Day One";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins_dayone");
    }

    public int getKills() {
        return jsonHandler.getSafeInt("kills_dayone");
    }

    public int getHeadshots() {
        return jsonHandler.getSafeInt("headshots_dayone");
    }
}
