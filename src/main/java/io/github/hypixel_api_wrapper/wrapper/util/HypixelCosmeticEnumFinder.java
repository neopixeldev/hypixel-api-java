package io.github.hypixel_api_wrapper.wrapper.util;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelCosmetic;
import java.util.Arrays;

public class HypixelCosmeticEnumFinder {
    public static HypixelCosmetic getHypixelCosmeticFromKey(Class<HypixelCosmetic> enumeration,
        String string) {
        Arrays.stream(enumeration.getEnumConstants()).sequential().anyMatch(enumValue -> {
            HypixelCosmetic cosmetic = (HypixelCosmetic) enumValue;
            if (cosmetic.getKey().equals(string)) {
                return true;
            }
            return false;
        });

        throw new RuntimeException(String.format("There is no Type mapping with name (%s)", string
        ));
    }
}
