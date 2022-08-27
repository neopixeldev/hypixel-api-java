package io.github.hypixel_api_wrapper.wrapper.games.bedwars.cosmetics;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelCosmetic;
import io.github.hypixel_api_wrapper.wrapper.games.HypixelCosmeticRarities;

public enum BedwarsProjectileTrails implements HypixelCosmetic {
    WHITE_SMOKE("White Smoke", "projectiletrail_white_smoke", HypixelCosmeticRarities.COMMON),
    WATER("Water", "projectiletrail_water", HypixelCosmeticRarities.COMMON),
    SLIME("Slime", "projectiletrail_slime", HypixelCosmeticRarities.COMMON),
    POTION("Potion", "projectiletrail_potion", HypixelCosmeticRarities.COMMON),
    LAVA("Lava", "projectiletrail_lava", HypixelCosmeticRarities.COMMON),
    ENDER("Ender", "projectiletrail_ender", HypixelCosmeticRarities.COMMON),
    BLACK_SMOKE("Black Smoke", "projectiletrail_black_smoke", HypixelCosmeticRarities.COMMON),

    ROSES("Roses", "projectiletrail_rose", HypixelCosmeticRarities.RARE),
    LUNAR_DUST("Lunar Dust", "projectiletrail_lunar_dust", HypixelCosmeticRarities.RARE),
    THE_END("The End", "projectiletrail_the_end_trail", HypixelCosmeticRarities.RARE),
    RED_DUST("Red Dust", "projectiletrail_red_dust", HypixelCosmeticRarities.RARE),
    PURPLE_DUST("Purple Dust", "projectiletrail_purple_dust", HypixelCosmeticRarities.RARE),
    NOTES("Notes", "projectiletrail_notes", HypixelCosmeticRarities.RARE),
    BLUE_DUST("Blue Dust", "projectiletrail_blue_dust", HypixelCosmeticRarities.RARE),

    SPRING_RIBBONS("Spring Ribbons", "projectiletrail_spring_ribbons", HypixelCosmeticRarities.EPIC),
    ROCKET("Rocket", "projectiletrail_rocket", HypixelCosmeticRarities.EPIC),
    RAINY("Rainy", "projectiletrail_rainy", HypixelCosmeticRarities.EPIC),
    PUMPKIN_PIE("Pumpkin Pie", "projectiletrail_pumpkin_pie", HypixelCosmeticRarities.EPIC),
    PORTAL("Portal", "projectiletrail_portal_trail", HypixelCosmeticRarities.EPIC),
    LET_THERE_BE_LEATHER("Let There Be Leather", "projectiletrail_let_there_be_leather", HypixelCosmeticRarities.EPIC),
    ICE_COLD("Ice Cold", "projectiletrail_cold", HypixelCosmeticRarities.EPIC),
    HOOPS("Hoops", "projectiletrail_hoops", HypixelCosmeticRarities.EPIC),
    HANUKKAH("Hanukkah", "projectiletrail_hanukkah", HypixelCosmeticRarities.EPIC),
    GREEN_STAR("Green Star", "projectiletrail_green_star", HypixelCosmeticRarities.EPIC),
    BONE("Bone", "projectiletrail_bone", HypixelCosmeticRarities.EPIC),
    SNOWBALL_RAIN("Snowball Rain", "projectiletrail_snowball_rain", HypixelCosmeticRarities.EPIC),
    MAGIC("Magic", "projectiletrail_magic", HypixelCosmeticRarities.EPIC),
    FIREWORK("Firework", "projectiletrail_firework", HypixelCosmeticRarities.EPIC),
    FIRE("Fire", "projectiletrail_fire", HypixelCosmeticRarities.EPIC),
    ANGRY_VILLAGER("Angry Villager", "projectiletrail_angry_villager", HypixelCosmeticRarities.EPIC),

    WINGMAN("Wingman", "projectiletrail_wingman", HypixelCosmeticRarities.LEGENDARY),
    TWISTED("Twisted", "projectiletrail_twisted_trail", HypixelCosmeticRarities.LEGENDARY),
    TWIN_DRAGON("Twin Dragon", "projectiletrail_twin_dragon", HypixelCosmeticRarities.LEGENDARY),
    TRICK_OR_TREAT("Trick or Treat", "projectiletrail_trick_or_treat", HypixelCosmeticRarities.LEGENDARY),
    TINSEL("Tinsel", "projectiletrail_tinsel", HypixelCosmeticRarities.LEGENDARY),
    STORMY("Stormy", "projectiletrail_stormy", HypixelCosmeticRarities.LEGENDARY),
    RANDOM("Random", "projectiletrail_random", HypixelCosmeticRarities.LEGENDARY),
    MERRY("Merry", "projectiletrail_merry", HypixelCosmeticRarities.LEGENDARY),
    MAGIC_WIND("Magic Wind", "projectiletrail_magic_wind", HypixelCosmeticRarities.LEGENDARY),
    JACK_O_LANTERN("Jack O' Lantern", "projectiletrail_Jack_O_Lantern_Trail", HypixelCosmeticRarities.LEGENDARY),
    FIRE_SPIRAL("Fire Spiral", "projectiletrail_fire_spiral", HypixelCosmeticRarities.LEGENDARY),
    DNA("DNA", "projectiletrail_chains", HypixelCosmeticRarities.LEGENDARY),
    CHEESE("Cheese", "projectiletrail_cheese", HypixelCosmeticRarities.LEGENDARY),
    BLOODY("Bloody", "projectiletrail_blood", HypixelCosmeticRarities.LEGENDARY),
    BEE("Bee", "projectiletrail_bee", HypixelCosmeticRarities.LEGENDARY),
    RAINBOW("Rainbow", "projectiletrail_rainbow", HypixelCosmeticRarities.LEGENDARY),
    PRESENT("Present", "projectiletrail_present", HypixelCosmeticRarities.LEGENDARY),
    PEEP("Peep!", "peep_hatching", HypixelCosmeticRarities.LEGENDARY),
    HEARTS("Hearts", "projectiletrail_hearts", HypixelCosmeticRarities.LEGENDARY),
    BITE("Bite", "projectiletrail_bite", HypixelCosmeticRarities.LEGENDARY);

    private final String name;
    private final String key;
    private final HypixelCosmeticRarities rarity;

    BedwarsProjectileTrails(String name, String key, HypixelCosmeticRarities rarity) {
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
