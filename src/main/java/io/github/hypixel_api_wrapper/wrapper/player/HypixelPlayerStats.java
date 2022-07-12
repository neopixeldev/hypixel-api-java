package io.github.hypixel_api_wrapper.wrapper.player;

import io.github.hypixel_api_wrapper.wrapper.hypixel_object_factory.HypixelBedWarsFactory;
import java.util.Optional;
import org.json.JSONObject;

/**
 * Used to keep track of a {@link HypixelPlayer}'s statistics on the
 * Hypixel Network.
 */
public class HypixelPlayerStats {

    private final JSONObject stats;
    private HypixelBedWarsFactory factory;

    public HypixelBedWarsFactory getBedwarsStats() {
        return Optional.ofNullable(factory).orElse(factory = new HypixelBedWarsFactory(stats));
    }

    public HypixelPlayerStats(JSONObject stats) {
        this.stats = stats;
    }

}
