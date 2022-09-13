package io.github.neopixel.wrapper;

import java.util.Optional;

public interface HypixelLootChestGame {

    Optional<Integer> getOpenedChestsAmount();

    Optional<Integer> getOpenedCommonChestsAmount();

    Optional<Integer> getOpenedRareChestsAmount();

    Optional<Integer> getOpenedEpicChestsAmount();

    Optional<Integer> getOpenedLegendaryChestsAmount();
}
