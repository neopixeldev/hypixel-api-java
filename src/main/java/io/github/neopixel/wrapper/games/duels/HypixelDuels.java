package io.github.neopixel.wrapper.games.duels;

import io.github.neopixel.wrapper.HypixelLootChestGame;
import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.Optional;

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
