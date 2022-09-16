package io.github.neopixel.wrapper.games.bedwars.cosmetics;

import io.github.neopixel.wrapper.games.HypixelCosmetic;
import io.github.neopixel.wrapper.games.HypixelCosmeticRarities;

public enum HypixelBedwarsBedDestroys implements HypixelCosmetic {
    FIREWORK("Firework", "", HypixelCosmeticRarities.COMMON),
    GHOST("Ghost", "", HypixelCosmeticRarities.COMMON),
    LIGHTNING_STRIKE("Lightning Strike", "", HypixelCosmeticRarities.COMMON),
    SQUID_MISSILE("Squid Missile", "", HypixelCosmeticRarities.COMMON),

    GLYPH("Glyph", "", HypixelCosmeticRarities.RARE),
    PIG_MISSILE("Pig Missile", "", HypixelCosmeticRarities.RARE),
    LAVA_EXPLOSION("Lava Explosion", "", HypixelCosmeticRarities.RARE),

    BLIZZARD("Blizzard", "", HypixelCosmeticRarities.EPIC),
    EGGSPLOSION("Eggsplosion", "", HypixelCosmeticRarities.EPIC),
    THIEF("Thief", "", HypixelCosmeticRarities.EPIC),
    TORNADO("Tornado", "", HypixelCosmeticRarities.EPIC),
    PRESENT("Present", "", HypixelCosmeticRarities.EPIC),
    PUMPKIN_EXPLOSION("Pumpkin Explosion", "", HypixelCosmeticRarities.EPIC),

    BED_BUGS("Bed Bugs", "", HypixelCosmeticRarities.LEGENDARY),
    BURNED_UP("Burned Up", "", HypixelCosmeticRarities.LEGENDARY),
    PIGSPLOSION("Pigsplosion", "", HypixelCosmeticRarities.LEGENDARY),
    LADY_BUG("Lady Bug", "", HypixelCosmeticRarities.LEGENDARY),
    EGG_POPPER("Egg Popper", "", HypixelCosmeticRarities.LEGENDARY),
    FISHY("Fishy", "", HypixelCosmeticRarities.LEGENDARY),
    STORMY("Stormy", "", HypixelCosmeticRarities.LEGENDARY);

    private final String name;
    private final String key;
    private final HypixelCosmeticRarities rarity;

    HypixelBedwarsBedDestroys(String name, String key, HypixelCosmeticRarities rarity) {
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
