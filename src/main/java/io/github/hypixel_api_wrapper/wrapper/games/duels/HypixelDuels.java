package io.github.hypixel_api_wrapper.wrapper.games.duels;

import io.github.hypixel_api_wrapper.wrapper.HypixelLootChestGame;
import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelDuels extends HypixelGame implements HypixelLootChestGame {

    protected HypixelDuels(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "DUELS";
    }

    @Override
    public String getGameName() {
        return "Duels";
    }

    @Override
    public boolean isRemoved() {
        return false;
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
