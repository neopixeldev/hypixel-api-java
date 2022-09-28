package io.github.neopixel.wrapper;

import java.util.Optional;

public interface HypixelLootChestGame {

    int getOpenedChestsAmount();

    int getOpenedCommonChestsAmount();

    int getOpenedRareChestsAmount();

    int getOpenedEpicChestsAmount();

    int getOpenedLegendaryChestsAmount();
}
