package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelGalaxyWars extends HypixelGame {

    protected HypixelGalaxyWars(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "GALAXY_WARS";
    }

    @Override
    public String getGameName() {
        return "Galaxy Wars";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getKills() {
        return jsonHandler.getSafeInt("sw_kills");
    }

    public int getShotsFired() {
        return jsonHandler.getSafeInt("sw_shots_fired");
    }

    public int getWeeklyKillsA() {
        return jsonHandler.getSafeInt("sw_weekly_kills_a");
    }

    public int getWeeklyKillsB() {
        return jsonHandler.getSafeInt("sw_weekly_kills_b");
    }

    public int getRebelKills() {
        return jsonHandler.getSafeInt("sw_rebel_kills");
    }

    public int getDeaths() {
        return jsonHandler.getSafeInt("sw_deaths");
    }

    public int getMonthlyKillsA() {
        return jsonHandler.getSafeInt("sw_monthly_kills_a");
    }

    public int getMonthlyKillsB() {
        return jsonHandler.getSafeInt("sw_monthly_kills_b");
    }

    public int getEmpireKills() {
        return jsonHandler.getSafeInt("sw_empire_kills");
    }
}
