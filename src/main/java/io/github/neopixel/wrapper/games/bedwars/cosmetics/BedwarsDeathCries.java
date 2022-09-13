package io.github.neopixel.wrapper.games.bedwars.cosmetics;

import io.github.neopixel.wrapper.games.HypixelCosmetic;
import io.github.neopixel.wrapper.games.HypixelCosmeticRarities;

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
    SQUEAL("Squeal", "deathcry_squeal", HypixelCosmeticRarities.RARE),
    DING("Ding", "deathcry_ding", HypixelCosmeticRarities.RARE),
    BURP("Burp", "deathcry_burp", HypixelCosmeticRarities.RARE),
    DOUSED_LANTERN("Doused Lantern", "deathcry_doused_lantern", HypixelCosmeticRarities.RARE),
    SCURRY("Scurry", "deathcry_scurry", HypixelCosmeticRarities.RARE),

    ENERGY("Energy", "deathcry_energy", HypixelCosmeticRarities.EPIC),
    AWW("Aww", "deathcry_aww", HypixelCosmeticRarities.EPIC),
    GRUMBLE("Grumble", "deathcry_grumble", HypixelCosmeticRarities.EPIC),
    HOWL("Howl", "deathcry_howl", HypixelCosmeticRarities.EPIC),
    FIREWORK("Firework", "deathcry_firework", HypixelCosmeticRarities.EPIC),
    DRAGON_ROAR("Dragon Roar", "deathcry_dragon_roar", HypixelCosmeticRarities.EPIC),
    GHOSTS_CRY("Ghost's Cry", "deathcry_ghosts_cry", HypixelCosmeticRarities.EPIC),
    SNIFF("Sniff", "deathcry_sniff", HypixelCosmeticRarities.EPIC),
    SQUEAK("Squeak", "deathcry_squeak", HypixelCosmeticRarities.EPIC),
    SAD_MOO("Sad Moo", "deathcry_sad_moo", HypixelCosmeticRarities.EPIC),

    MIRACLE("Miracle", "deathcry_miracle", HypixelCosmeticRarities.LEGENDARY),
    ARCADE("Arcade", "deathcry_merry_jingle", HypixelCosmeticRarities.LEGENDARY),
    DARK_PORTAL("Dark Portal", "deathcry_dark_portal", HypixelCosmeticRarities.LEGENDARY),
    GUARDIAN("Guardian", "deathcry_guardian_death", HypixelCosmeticRarities.LEGENDARY),
    HAUNTED_CURSE("Haunted Curse", "deathcry_haunted_curse", HypixelCosmeticRarities.LEGENDARY),
    RAGE("Rage", "deathcry_rage", HypixelCosmeticRarities.LEGENDARY);

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
