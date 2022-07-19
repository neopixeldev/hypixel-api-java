package io.github.hypixel_api_wrapper.wrapper.games.bedwars.cosmetics;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelCosmetic;
import io.github.hypixel_api_wrapper.wrapper.games.HypixelCosmeticRarities;

public enum HypixelBedwarsKillMessages implements HypixelCosmetic {
    ;

    private String name;
    private String key;
    private HypixelCosmeticRarities rarity;

    HypixelBedwarsKillMessages(String name, String key, HypixelCosmeticRarities rarity) {
        this.name = name;
        this.key = key;
        this.rarity = rarity;
    }

    @Override
    public String getFormattedName() {
        return null;
    }

    @Override
    public String getKey() {
        return null;
    }

    @Override
    public HypixelCosmeticRarities getRarity() {
        return null;
    }
}
