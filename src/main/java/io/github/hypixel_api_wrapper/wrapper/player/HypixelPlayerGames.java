package io.github.hypixel_api_wrapper.wrapper.player;

import io.github.hypixel_api_wrapper.wrapper.hypixel_object_factory.HypixelBedWarsFactory;
import java.util.Optional;
import org.json.JSONObject;

/**
 * Used to keep track of a {@link HypixelPlayer}'s statistics on the
 * Hypixel Network.
 */
public class HypixelPlayerGames {

    private final JSONObject stats;
    private HypixelBedWarsFactory factory;

    public HypixelPlayerGames(JSONObject stats) {
        this.stats = stats;
    }

    public HypixelBedWarsFactory getBedWarsStats() {
        return Optional.ofNullable(factory).orElse(factory = new HypixelBedWarsFactory(stats));
    }

}
