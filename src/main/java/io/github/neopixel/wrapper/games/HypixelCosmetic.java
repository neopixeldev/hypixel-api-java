package io.github.neopixel.wrapper.games;


public interface HypixelCosmetic {

    String getFormattedName();

    String getKey();

    HypixelCosmeticRarities getRarity();

    static HypixelCosmetic getHypixelCosmeticFromKey(
        Class<? extends HypixelCosmetic> enumeration,
        String string) {

        for (HypixelCosmetic cosmetic : enumeration.getEnumConstants()) {
            if (cosmetic.getKey().equals(string)) {
                return cosmetic;
            }
        }
        return null;
    }
}
