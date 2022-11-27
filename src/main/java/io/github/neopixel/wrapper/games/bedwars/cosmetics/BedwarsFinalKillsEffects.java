package io.github.neopixel.wrapper.games.bedwars.cosmetics;

import io.github.neopixel.wrapper.games.HypixelCosmetic;
import io.github.neopixel.wrapper.games.HypixelCosmeticRarities;

public enum BedwarsFinalKillsEffects implements HypixelCosmetic {
    LIGHTNING_STRIKE("Lightning Strike", "killeffect_lighting_strike", HypixelCosmeticRarities.COMMON),
    FIREWORK("Firework", "killeffect_firework", HypixelCosmeticRarities.COMMON),
    TNT("TNT", "killeffect_tnt", HypixelCosmeticRarities.COMMON),
    SQUID_MISSILE("Squid Missile", "killeffect_squid_missile", HypixelCosmeticRarities.COMMON),

    LAST_CANDLE("Last Candle", "killeffect_candle", HypixelCosmeticRarities.RARE),
    ITS_RAINING_GOLD("Its Raining Gold", "killeffect_raining_gold", HypixelCosmeticRarities.RARE),
    HEART_AURA("Heart Aura", "killeffect_heart_aura", HypixelCosmeticRarities.RARE),
    HEAD_ROCKET("Head Rocket", "killeffect_head_rocket", HypixelCosmeticRarities.RARE),
    FIRE_BREATH("Fire Breath", "killeffect_fire_breath", HypixelCosmeticRarities.RARE),
    COOKIE_FOUNTAIN("Cookie Fountain", "killeffect_cookie_fountain", HypixelCosmeticRarities.RARE),
    CAMPFIRE("Campfire", "killeffect_campfire", HypixelCosmeticRarities.RARE),
    BURNING_SHOES("Burning Shoes", "killeffect_burning_shoes", HypixelCosmeticRarities.RARE),
    BLACK_MARK("Black Mark", "killeffect_black_mark", HypixelCosmeticRarities.RARE),
    MAGNOLIA("Magnolia", "killeffect_magnolia", HypixelCosmeticRarities.RARE),
    EASTER_EGG_THEFT("Easter Egg Theft", "killeffect_egg_theft", HypixelCosmeticRarities.RARE),

    REKT("Rekt", "killeffect_rekt", HypixelCosmeticRarities.EPIC),
    PINATA("Piñata", "killeffect_piñata", HypixelCosmeticRarities.EPIC),
    BLOOD_EXPLOSION("Blood Explosion", "killeffect_blood_explosion", HypixelCosmeticRarities.EPIC),
    BEEF_EVERYWHERE("Beef Everywhere", "killeffect_beef_everywhere", HypixelCosmeticRarities.EPIC),
    ANVIL_SMASH("Anvil Smash", "killeffect_anvil_smash", HypixelCosmeticRarities.EPIC),
    KILL_COUNTER("Kill Counter", "killeffect_kill_counter_holo", HypixelCosmeticRarities.EPIC),
    HOLIDAY_FIREWORKS("Holiday Fireworks", "killeffect_holiday_fireworks", HypixelCosmeticRarities.EPIC),
    HAUNTED("Haunted", "killeffect_haunted", HypixelCosmeticRarities.EPIC),
    HATCHING_EGGS("Hatching Eggs", "killeffect_hatching_eggs", HypixelCosmeticRarities.EPIC),
    GIFT_EXPLOSION("Gift Explosion", "killeffect_gift_explosion", HypixelCosmeticRarities.EPIC),
    EXPERIENCE_ORB("Experience Orb", "killeffect_xp_orb", HypixelCosmeticRarities.EPIC),
    CHICKEN_TOWER("Chicken Tower", "killeffect_chicken_tower", HypixelCosmeticRarities.EPIC),
    BUNNY_EXPLOSION("Bunny Explosion", "killeffect_bunny_explosion", HypixelCosmeticRarities.EPIC),
    SPIRIT("Spirit", "killeffect_spirit", HypixelCosmeticRarities.EPIC),
    SMILEY("Smiley", "killeffect_smiley", HypixelCosmeticRarities.EPIC),
    SNOW_GLOBE("Snow Globe", "killeffect_snow_globe", HypixelCosmeticRarities.EPIC),
    RAINING_EASTER_EGGS("Raining Easter Eggs", "killeffect_raining_eggs", HypixelCosmeticRarities.EPIC),
    RAIN_ON_MY_PARADE("Rain on my Parade", "killeffect_rain_on_my_parade", HypixelCosmeticRarities.EPIC),
    PUMPKIN_ROCKET("Pumpkin Rocket", "killeffect_pumpkin_rocket", HypixelCosmeticRarities.EPIC),

    PETAL_GUST("Petal Gust", "killeffect_petal_gust", HypixelCosmeticRarities.LEGENDARY),
    SHOCK_WAVE("Shock Wave", "killeffect_shockwave", HypixelCosmeticRarities.LEGENDARY),
    LIT("Lit", "killeffect_lit", HypixelCosmeticRarities.LEGENDARY),
    FINAL_SMASH("Final Smash", "killeffect_final_smash", HypixelCosmeticRarities.LEGENDARY),
    HOLIDAY_TREE("Holiday Tree", "killeffect_holiday_tree", HypixelCosmeticRarities.LEGENDARY),
    GUARDIAN_ROCKET("Guardian Rocket", "killeffect_guardian_rocket", HypixelCosmeticRarities.LEGENDARY),
    COW_ROCKET("Cow Rocket", "killeffect_cow_rocket", HypixelCosmeticRarities.LEGENDARY),
    BATCRUX("Batcrux", "killeffect_batcrux", HypixelCosmeticRarities.LEGENDARY),
    TORNADO("Tornado", "killeffect_tornado", HypixelCosmeticRarities.LEGENDARY),
    SOUL_RIPPER("Soul Ripper", "killeffect_soul_ripper", HypixelCosmeticRarities.LEGENDARY),
    SNOWPLOSION("Snowplosion", "killeffect_snowplosion", HypixelCosmeticRarities.LEGENDARY),
    SHATTERED("Shattered", "killeffect_shattered", HypixelCosmeticRarities.LEGENDARY),
    RAINBOW("Rainbow", "killeffect_rainbow", HypixelCosmeticRarities.LEGENDARY),
    PUMPKIN_POPPER("Pumpkin Popper", "killeffect_pumpkin_popper", HypixelCosmeticRarities.LEGENDARY),
    PIG_SMASH("Pig Smash", "killeffect_pigsmash", HypixelCosmeticRarities.LEGENDARY);

    private final String name;
    private final String key;
    private final HypixelCosmeticRarities rarity;

    BedwarsFinalKillsEffects(String name, String key, HypixelCosmeticRarities rarity) {
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
