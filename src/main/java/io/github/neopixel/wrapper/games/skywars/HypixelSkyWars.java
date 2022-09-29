package io.github.neopixel.wrapper.games.skywars;

import io.github.neopixel.wrapper.HypixelLootChestGame;
import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.Optional;

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
