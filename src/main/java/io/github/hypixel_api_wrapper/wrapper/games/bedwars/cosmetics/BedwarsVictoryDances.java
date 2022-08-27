package io.github.hypixel_api_wrapper.wrapper.games.bedwars.cosmetics;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelCosmetic;
import io.github.hypixel_api_wrapper.wrapper.games.HypixelCosmeticRarities;

public enum BedwarsVictoryDances implements HypixelCosmetic {
    YEEHAW("Yeehaw", "victorydance_yeehaw", HypixelCosmeticRarities.COMMON),
    FIREWORKS("Fireworks", "victorydance_fireworks", HypixelCosmeticRarities.COMMON),
    COLD_SNAP("Cold Snap", "victorydance_cold_snap", HypixelCosmeticRarities.COMMON),
    ANVIL_RAIN("Anvil Rain", "victorydance_anvil_rain", HypixelCosmeticRarities.COMMON),

    RAINING_PIGS("Raining Pigs", "victorydance_raining_pigs", HypixelCosmeticRarities.RARE),
    FESTIVE_MUSIC("Festive Music", "victorydance_festive_music", HypixelCosmeticRarities.RARE),
    AURA("Aura", "victorydance_aura", HypixelCosmeticRarities.RARE),
    ANOTHER_DIMENSION("Another Dimension", "victorydance_portal", HypixelCosmeticRarities.RARE),
    NIGHT_SHIFT("Night Shift", "victorydance_night_shift", HypixelCosmeticRarities.RARE),
    METEOR_SHOWER("Meteor Shower", "victorydance_meteor_shower", HypixelCosmeticRarities.RARE),
    GUARDIANS("Guardians", "victorydance_guardians", HypixelCosmeticRarities.RARE),
    FLOATING_LANTERNS("Floating Lanterns", "victorydance_floating_lanterns", HypixelCosmeticRarities.RARE),

    PUMPKIN_PATCH("Pumpkin Patch", "victorydance_pumpkin_patch", HypixelCosmeticRarities.EPIC),
    HEAT_WAVE("Heat Wave", "victorydance_heat_wave", HypixelCosmeticRarities.EPIC),
    FLOWER_BED("Flower Bed", "victorydance_flower_bed", HypixelCosmeticRarities.EPIC),
    EASTER_BUNNIES("Easter Bunnies", "victorydance_easter_bunnies", HypixelCosmeticRarities.EPIC),
    WITHER_RIDER("Wither Rider", "victorydance_wither_rider", HypixelCosmeticRarities.EPIC),
    VEGGY_SPRINGLAZOR("Veggy SpringLazor™", "victorydance_pumpkin_laser", HypixelCosmeticRarities.EPIC),
    TOY_STICK("Toy Stick", "victorydance_toy_stick", HypixelCosmeticRarities.EPIC),
    TERROR("Terror", "victorydance_terror", HypixelCosmeticRarities.EPIC),
    SPECIAL_FIREWORKS("Special Fireworks", "victorydance_special_fireworks", HypixelCosmeticRarities.EPIC),
    RAINBOW_DOLLY("Rainbow Dolly", "victorydance_rainbow_dolly", HypixelCosmeticRarities.EPIC),
    CHINESE_DRAGON("Chinese Dragon", "victorydance_chinese_dragon", HypixelCosmeticRarities.EPIC),
    CAKE_WALK("Cake Walk", "victorydance_cake_walk", HypixelCosmeticRarities.EPIC),

    TO_BUILD_A_SNOWMAN("To Build a Snowman", "victorydance_to_build_a_snowman", HypixelCosmeticRarities.LEGENDARY),
    SNOWED_IN("Snowed In", "victorydance_snowed_in", HypixelCosmeticRarities.LEGENDARY),
    PUPPY_PARTY("Puppy Party", "victorydance_puppy_party", HypixelCosmeticRarities.LEGENDARY),
    INFECTION("Infection", "victorydance_infection", HypixelCosmeticRarities.LEGENDARY),
    HAUNTED("Haunted", "victorydance_haunted", HypixelCosmeticRarities.LEGENDARY),
    FANBASE("Fanbase", "victorydance_fanbase", HypixelCosmeticRarities.LEGENDARY),
    EXPLODING_BUNNIES("Exploding Bunnies", "victorydance_exploding_bunnies", HypixelCosmeticRarities.LEGENDARY),
    ELDER_GUARDIAN("Elder Guardian", "victorydance_elder_guardian_rider", HypixelCosmeticRarities.LEGENDARY),
    CHICKEN_RIDER("Chicken Rider", "victorydance_chicken_rider", HypixelCosmeticRarities.LEGENDARY),
    ABOMINABLE_SNOWMAN("Abominable Snowman", "victorydance_abominable_snowman", HypixelCosmeticRarities.LEGENDARY),
    TWERK_APOCALYPSE("Twerk Apocalypse", "victorydance_twerk_apocalypse", HypixelCosmeticRarities.LEGENDARY),
    GHAST_RIDER("Ghast Rider", "victorydance_ghast_rider", HypixelCosmeticRarities.LEGENDARY),
    DRAGON_RIDER("Dragon Rider", "victorydance_dragon_rider", HypixelCosmeticRarities.LEGENDARY);

    private final String name;
    private final String key;
    private final HypixelCosmeticRarities rarity;

    BedwarsVictoryDances(String name, String key, HypixelCosmeticRarities rarity) {
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
