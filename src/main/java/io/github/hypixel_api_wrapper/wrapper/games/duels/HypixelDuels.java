package io.github.hypixel_api_wrapper.wrapper.games.duels;

import io.github.hypixel_api_wrapper.wrapper.HypixelLootChestGame;
import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import java.util.Optional;
import org.json.JSONObject;

public class HypixelDuels extends HypixelGame implements HypixelLootChestGame {

    protected HypixelDuels(JSONHandler jsonHandler) {
        super(jsonHandler);
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
