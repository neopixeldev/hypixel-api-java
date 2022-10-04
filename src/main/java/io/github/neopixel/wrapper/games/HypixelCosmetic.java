package io.github.neopixel.wrapper.games;

import java.util.Optional;

public interface HypixelCosmetic {

    String getFormattedName();

    String getKey();

    HypixelCosmeticRarities getRarity();

    static HypixelCosmetic getHypixelCosmeticFromKey(
        Class<? extends HypixelCosmetic> enumeration,
        String string) {

        for (Object e : enumeration.getEnumConstants()) {
            HypixelCosmetic cosmetic = (HypixelCosmetic) e;
            if (cosmetic.getKey().equals(string)) {
                return cosmetic;
            }
        }
        return null;
    }
}
