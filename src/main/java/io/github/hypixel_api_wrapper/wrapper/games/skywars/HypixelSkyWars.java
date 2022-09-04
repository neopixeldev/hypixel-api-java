package io.github.hypixel_api_wrapper.wrapper.games.skywars;

import io.github.hypixel_api_wrapper.wrapper.HypixelLootChestGame;
import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import java.util.Optional;
import org.json.JSONObject;

public class HypixelSkyWars extends HypixelGame implements HypixelLootChestGame {

    protected HypixelSkyWars(JSONHandler jsonHandler) {
        super(jsonHandler);
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
    public final Optional<Integer> getOpenedChestsAmount() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Optional<Integer> getOpenedCommonChestsAmount() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Optional<Integer> getOpenedRareChestsAmount() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Optional<Integer> getOpenedEpicChestsAmount() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Optional<Integer> getOpenedLegendaryChestsAmount() {
        throw new UnsupportedOperationException();
    }
}
