package io.github.neopixel.wrapper.games;


public interface HypixelCosmetic {

    public String getFormattedName();
    public String getKey();
    public HypixelCosmeticRarities getRarity();

    public static HypixelCosmetic getHypixelCosmeticFromKey(
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
