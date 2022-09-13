package io.github.neopixel.wrapper.games.bedwars.cosmetics;

import io.github.neopixel.wrapper.games.HypixelCosmetic;
import io.github.neopixel.wrapper.games.HypixelCosmeticRarities;

public enum HypixelBedwarsWoodSkins implements HypixelCosmetic {
    OAK_PLANK("Oak Plank", "", HypixelCosmeticRarities.COMMON),

    BIRCH_PLANK("Birch Plank", "", HypixelCosmeticRarities.RARE),
    SPRUCE_PLANK("Spruce Plank", "", HypixelCosmeticRarities.RARE),

    ACACIA_PLANK("Acacia Plank", "", HypixelCosmeticRarities.EPIC),
    JUNGLE_PLANK("Jungle Plank", "", HypixelCosmeticRarities.EPIC),

    OAK_LOG("Oak Log", "", HypixelCosmeticRarities.LEGENDARY),
    BIRCH_LOG("Birch Log", "", HypixelCosmeticRarities.LEGENDARY),
    SPRUCE_LOG("Spruce Log", "", HypixelCosmeticRarities.LEGENDARY),
    ACACIA_LOG("Acacia Log", "", HypixelCosmeticRarities.LEGENDARY),
    JUNGLE_LOG("Jungle Log", "", HypixelCosmeticRarities.LEGENDARY),
    DARK_OAK_PLANK("Dark Oak Plank", "", HypixelCosmeticRarities.LEGENDARY),
    DARK_OAK_LOG("Dark Oak Log", "", HypixelCosmeticRarities.LEGENDARY);

    private final String name;
    private final String key;
    private final HypixelCosmeticRarities rarity;

    HypixelBedwarsWoodSkins(String name, String key, HypixelCosmeticRarities rarity) {
        this.name = name;
        this.key = key;
        this.rarity = rarity;
    }

    @Override
    public String getFormattedName() {
        return this.name;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public HypixelCosmeticRarities getRarity() {
        return this.rarity;
    }
}
