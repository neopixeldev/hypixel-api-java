package io.github.hypixel_api_wrapper.wrapper.util;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelCosmetic;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class HypixelCosmeticEnumFinder {
    public static Optional<HypixelCosmetic> getHypixelCosmeticFromKey(Class<? extends HypixelCosmetic> enumeration,
        String string) {

        AtomicReference<HypixelCosmetic> cosmeticObject = null;

       if(Arrays.stream(enumeration.getEnumConstants()).sequential().anyMatch(enumValue -> {
            HypixelCosmetic cosmetic = (HypixelCosmetic) enumValue;
            if (cosmetic.getKey().equals(string)) {
                cosmeticObject.set(cosmetic);
                return true;
            }
            return false;
        })) {
           return Optional.of(cosmeticObject.get());
       } else {
           return Optional.empty();
       }
    }
}
