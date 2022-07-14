package io.github.hypixel_api_wrapper.wrapper.games.skywars;

import io.github.hypixel_api_wrapper.wrapper.HypixelLootChestGame;
import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelSkyWars extends HypixelGame implements HypixelLootChestGame {

    protected HypixelSkyWars(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "SKYWARS";
    }

    @Override
    public String getGameName() {
        return "SkyWars";
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
