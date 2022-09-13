package io.github.neopixel.wrapper.games;

import io.github.neopixel.wrapper.util.HypixelColors;

public enum HypixelCosmeticRarities {
    COMMON(HypixelColors.GREEN),
    RARE(HypixelColors.AQUA),
    EPIC(HypixelColors.DARK_PURPLE),
    LEGENDARY(HypixelColors.GOLD);

    private final HypixelColors color;

    HypixelCosmeticRarities(HypixelColors color) {
        this.color = color;
    }

    public HypixelColors getColor() {
        return color;
    }
}
