package io.github.hypixel_api_wrapper.wrapper.util;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelCosmetic;
import java.util.Arrays;

public class HypixelCosmeticEnumFinder {

    public static HypixelCosmetic searchEnum(HypixelCosmetic enumeration,
        String search) {

        Arrays.stream(enumeration.getClass().getEnumConstants()).sequential().anyMatch(cosmetic -> {
            if (cosmetic.getKey().equals(search)) {
                return true;
            }
            return false;
        });

        throw new RuntimeException(String.format("There is no Type mapping with name (%s)",
            enumeration.getFormattedName()));
    }
}
