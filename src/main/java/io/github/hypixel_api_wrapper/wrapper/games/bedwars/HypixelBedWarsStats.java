package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import io.github.hypixel_api_wrapper.wrapper.HypixelLootChestGame;
import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelBedWarsStats extends HypixelGame implements HypixelLootChestGame {
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


    public HypixelBedWars getMode(HypixelBedWarsMode mode) {
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

    public final int getChristmasChestsAmount() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getOpenedChestsAmount() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getOpenedCommonChestsAmount() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getOpenedRareChestsAmount() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getOpenedEpicChestsAmount() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getOpenedLegendaryChestsAmount() {
        throw new UnsupportedOperationException();
    }
}
