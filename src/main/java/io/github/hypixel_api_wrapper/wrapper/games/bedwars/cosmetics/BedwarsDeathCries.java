package io.github.hypixel_api_wrapper.wrapper.games.bedwars.cosmetics;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelCosmetic;
import io.github.hypixel_api_wrapper.wrapper.games.HypixelCosmeticRarities;
import io.github.hypixel_api_wrapper.wrapper.util.HypixelColors;

public enum BedwarsDeathCries implements HypixelCosmetic {

    DINOSAUR("Dinosaur", "deathcry_dinosaur", HypixelCosmeticRarities.COMMON),
    DEFLATED_TOY("Deflated Toy", "deathcry_deflated_toy", HypixelCosmeticRarities.COMMON),
    DRY_BONES("Dry Bones", "deathcry_dry_bones", HypixelCosmeticRarities.COMMON),
    MONSTER_BURP("Monster Burp", "deathcry_monster_burp", HypixelCosmeticRarities.COMMON),
    PIG("Pig", "deathcry_pig", HypixelCosmeticRarities.COMMON),
    BAZINGA("Bazinga", "deathcry_bazinga", HypixelCosmeticRarities.COMMON),
    SAD_PUPPY("Sad Puppy", "deathcry_sad_puppy", HypixelCosmeticRarities.COMMON),
    GRUMPY_VILLAGER("Grumpy Villager", "deathcry_grumpy_villager", HypixelCosmeticRarities.COMMON),
    ROBOT_MOUSE("Robot Mouse", "deathcry_robot_mouse", HypixelCosmeticRarities.COMMON),
    ENDERMAN("Enderman", "deathcry_enderman", HypixelCosmeticRarities.COMMON),
    FIREBALL("Fireball", "deathcry_fireball", HypixelCosmeticRarities.COMMON),

    SPLASH("Splash", "deathcry_splash", HypixelCosmeticRarities.RARE),
    PLOP("Plop", "deathcry_plop", HypixelCosmeticRarities.RARE),
    GONE("Gone", "deathcry_gone", HypixelCosmeticRarities.RARE),
    BAT("Bat", "deathcry_bat", HypixelCosmeticRarities.RARE),
    CAT("Cat", "deathcry_cat_hit", HypixelCosmeticRarities.RARE),


    ENERGY("Energy", "deathcry_energy", HypixelCosmeticRarities.EPIC),
    AWW("Aww", "deathcry_aww", HypixelCosmeticRarities.EPIC),
    GRUMBLE("Grumble", "deathcry_grumble", HypixelCosmeticRarities.EPIC),
    HOWL("Howl", "deathcry_howl", HypixelCosmeticRarities.EPIC),
    FIREWORK("Firework", "deathcry_firework", HypixelCosmeticRarities.EPIC),

    MIRACLE("Miracle", "deathcry_miracle", HypixelCosmeticRarities.LEGENDARY),


    // TODO: the following cosmetics have no keys. a list of unassigned keys are below
    /*
     * deathcry_fragile
     * deathcry_big_baby
     * deathcry_villain
     * deathcry_wow
     * deathcry_punked
     * deathcry_disintegrated
     * deathcry_sploosh
     */
    DING("Ding", "", HypixelCosmeticRarities.RARE),
    ARCADE("Arcade", "deathcry_merry_jingle", HypixelCosmeticRarities.LEGENDARY),
    BURP("Burp", "", HypixelCosmeticRarities.RARE),
    DARK_PORTAL("Dark Portal", "deathcry_disintegrated", HypixelCosmeticRarities.LEGENDARY),
    DOUSED_LANTERN("Doused Lantern", "", HypixelCosmeticRarities.RARE),
    DRAGON_ROAR("Dragon Roar", "", HypixelCosmeticRarities.EPIC),
    GHOSTS_CRY("Ghost's Cry", "", HypixelCosmeticRarities.EPIC),
    GUARDIAN("Guardian", "", HypixelCosmeticRarities.LEGENDARY),
    HAUNTED_CURSE("Haunted Curse", "deathcry_wither", HypixelCosmeticRarities.LEGENDARY),
    RAGE("Rage", "", HypixelCosmeticRarities.LEGENDARY),
    SAD_MOO("Sad Moo", "", HypixelCosmeticRarities.EPIC),
    SCURRY("Scurry", "", HypixelCosmeticRarities.RARE),
    SNIFF("Sniff", "deathcry_sniff", HypixelCosmeticRarities.EPIC),
    SQUEAK("Squeak", "deathcry_squeak", HypixelCosmeticRarities.EPIC),
    SQUEAL("Squeal", "", HypixelCosmeticRarities.RARE);

    private final String name;
    private final String key;
    private final HypixelCosmeticRarities rarity;

    BedwarsDeathCries(String name, String key, HypixelCosmeticRarities rarity) {
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
