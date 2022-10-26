package io.github.neopixel.wrapper.games.uhc;

import io.github.neopixel.wrapper.games.bedwars.BedWarsKillCause;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelUHC {

    private final JSONHandler jsonHandler;

    protected HypixelUHC(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }


    public int getWins() {
        return jsonHandler.getSafeInt("wins");
    }

    public int getHeadsEaten() {
        return jsonHandler.getSafeInt("heads_eaten");
    }

    public int getKills() {
        return jsonHandler.getSafeInt("kills");
    }

    public int getDeaths() {
        return jsonHandler.getSafeInt("deaths");
    }

    public int getKillToDeathRatio() {
        return getKills() / Math.max(getDeaths(), 1);
    }

    public int getUltimatesCrafted() {
        return jsonHandler.getSafeInt("ultimates_crafted");
    }

    public int getExtraUltimatesCrafted() {
        return jsonHandler.getSafeInt("extra_ultimates_crafted");
    }

}
