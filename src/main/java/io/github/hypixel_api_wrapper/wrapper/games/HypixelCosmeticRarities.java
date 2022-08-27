package io.github.hypixel_api_wrapper.wrapper.games;

import io.github.hypixel_api_wrapper.wrapper.util.HypixelColors;

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
