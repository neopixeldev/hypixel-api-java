package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelBlockingDead extends HypixelGame {

    protected HypixelBlockingDead(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "BLOCKING_DEAD";
    }

    @Override
    public String getGameName() {
        return "Blocking Dead";
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
