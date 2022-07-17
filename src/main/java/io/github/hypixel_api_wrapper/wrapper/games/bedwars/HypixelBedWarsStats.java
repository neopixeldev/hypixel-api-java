package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelBedWarsStats extends HypixelGame  {
    public HypixelBedWarsStats(JSONObject stats) {
        super(stats);
    }
    @Override
    public String getGameID() {
        return "BEDWARS";
    }
    @Override
    public String getGameName() {
        return "Bed Wars";
    }
    @Override
    public boolean isRemoved() {
        return false;
    }

    public HypixelBedWars getMode(JSONObject stats, HypixelBedWarsModes mode) {
        return new HypixelBedWars(stats, mode);
    }

    public final int getCoins() {
        throw new UnsupportedOperationException();
    }

    public final int getLevel() {
        throw new UnsupportedOperationException();
    }

    public final int getExperience() {
        throw new UnsupportedOperationException();
    }

    public final String getBoxEpics() {
        throw new UnsupportedOperationException();
    }

    public final String getActiveVictoryDance() {
        throw new UnsupportedOperationException();
    }

    public final String getActiveIslandTopper() {
        throw new UnsupportedOperationException();
    }

    public final String getActiveSprays() {
        throw new UnsupportedOperationException();
    }

    public final String getActiveDeathCry() {
        throw new UnsupportedOperationException();
    }

    public final int getOpenedChestsAmount() {
        throw new UnsupportedOperationException();
    }

    public final int getOpenedCommonChestsAmount() {
        throw new UnsupportedOperationException();
    }

    public final int getOpenedRareChestsAmount() {
        throw new UnsupportedOperationException();
    }

    public final int getOpenedEpicChestsAmount() {
        throw new UnsupportedOperationException();
    }

    public final int getOpenedLegendaryChestsAmount() {
        throw new UnsupportedOperationException();
    }

    public final int getChristmasChestsAmount() {
        throw new UnsupportedOperationException();
    }
}
