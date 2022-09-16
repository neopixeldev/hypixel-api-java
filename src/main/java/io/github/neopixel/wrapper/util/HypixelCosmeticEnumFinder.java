package io.github.neopixel.wrapper.util;

import io.github.neopixel.wrapper.games.HypixelCosmetic;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;


public class HypixelCosmeticEnumFinder {

    public static Optional<HypixelCosmetic> getHypixelCosmeticFromKey(
        Class<? extends HypixelCosmetic> enumeration,
        String string) {

        for (Object e : enumeration.getEnumConstants()) {
            HypixelCosmetic cosmetic = (HypixelCosmetic) e;
            if (cosmetic.getKey().equals(string)) {
                return Optional.of(cosmetic);
            }
        }

        return Optional.empty();
    }
}
