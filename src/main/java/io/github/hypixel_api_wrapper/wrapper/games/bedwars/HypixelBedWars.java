package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import io.github.hypixel_api_wrapper.wrapper.HypixelLootChestGame;
import org.json.JSONObject;

public class HypixelBedWars extends AbstractHypixelBedWars implements HypixelLootChestGame {

    public HypixelBedWars(JSONObject stats) {
        super(stats);
    }

    @Override
    String prefix() {
        return "";
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
    public final int getOpenedChestsAmount() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int getOpenedCommonChestsAmount() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int getOpenedRareChestsAmount() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int getOpenedEpicChestsAmount() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int getOpenedLegendaryChestsAmount() {
        throw new UnsupportedOperationException();
    }
}
