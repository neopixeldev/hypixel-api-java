package io.github.neopixel.wrapper.games.bedwars.cosmetics;

import io.github.neopixel.wrapper.games.HypixelCosmetic;
import io.github.neopixel.wrapper.games.HypixelCosmeticRarities;

public enum HypixelBedwarsKillMessages implements HypixelCosmetic {
    WESTERN("Western", "killmessages_western", HypixelCosmeticRarities.COMMON),
    HONOURABLE("Honourable", "killmessages_honourable", HypixelCosmeticRarities.COMMON),
    FIRE("Fire", "killmessages_fire", HypixelCosmeticRarities.COMMON),

    SQUEAK("Squeak", "killmessages_squeak", HypixelCosmeticRarities.RARE),
    OXED("Ox'd", "killmessages_oxed", HypixelCosmeticRarities.RARE),
    WOOF_WOOF("Woof Woof", "killmessages_woof_woof", HypixelCosmeticRarities.RARE),
    SANTAS_WORKSHOP("Santa's Workshop", "killmessages_santa_workshop", HypixelCosmeticRarities.RARE),
    PRIMAL("Primal", "killmessages_primal", HypixelCosmeticRarities.RARE),
    OINK("Oink", "killmessages_oink", HypixelCosmeticRarities.RARE),
    LOVE("Love", "killmessages_love", HypixelCosmeticRarities.RARE),
    BUZZ("Buzz", "killmessages_buzz", HypixelCosmeticRarities.RARE),
    BBQ("Bbq", "killmessages_bbq", HypixelCosmeticRarities.RARE),

    WRAPPED_UP("Wrapped Up", "killmessages_wrapped_up", HypixelCosmeticRarities.EPIC),
    TO_THE_MOON("To The Moon", "killmessages_to_the_moon", HypixelCosmeticRarities.EPIC),
    ROAR("Roar", "killmessages_roar", HypixelCosmeticRarities.EPIC),
    NOBLE("Noble", "killmessages_noble", HypixelCosmeticRarities.EPIC),
    FESTIVE("Festive", "killmessages_festive", HypixelCosmeticRarities.EPIC),
    CELEBRATORY("Celebratory", "killmessages_celebratory", HypixelCosmeticRarities.EPIC),
    SNOW_STORM("Snow Storm", "killmessages_snow_storm", HypixelCosmeticRarities.EPIC),
    PIRATE("Pirate", "killmessages_pirate", HypixelCosmeticRarities.EPIC),
    MEMED("Memed", "killmessages_memed", HypixelCosmeticRarities.EPIC),
    LITERALLY_SPOOKY("Literally Spooky", "killmessages_spooky", HypixelCosmeticRarities.EPIC),
    EGGY("Eggy", "killmessages_eggy", HypixelCosmeticRarities.EPIC),
    DRAMATIC("Dramatic", "killmessages_dramatic", HypixelCosmeticRarities.EPIC),

    SOCIAL_DISTANCE("Social Distance", "killmessages_social_distancing", HypixelCosmeticRarities.LEGENDARY),
    OLD_MAN("Old Man", "killmessages_old_man", HypixelCosmeticRarities.LEGENDARY),
    BRIDGING_FOR_DUMMIES("Bridging for Dummies", "killmessages_bridging_for_dummies", HypixelCosmeticRarities.LEGENDARY),
    GLORIOUS("Glorious", "killmessages_glorious", HypixelCosmeticRarities.LEGENDARY),
    TRIUMPH("Triumph", "killmessages_counter", HypixelCosmeticRarities.LEGENDARY);

    private final String name;
    private final String key;
    private final HypixelCosmeticRarities rarity;

    HypixelBedwarsKillMessages(String name, String key, HypixelCosmeticRarities rarity) {
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
