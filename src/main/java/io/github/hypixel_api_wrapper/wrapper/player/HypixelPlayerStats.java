package io.github.hypixel_api_wrapper.wrapper.player;

import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWarsStats;
import java.util.Optional;
import org.json.JSONObject;

/**
 * Used to keep track of a {@link HypixelPlayer}'s statistics on the
 * Hypixel Network.
 */
public class HypixelPlayerStats {

    private final JSONObject stats;

    HypixelBedWarsStats bedWarsStats;

    public HypixelPlayerStats(JSONObject stats) {
        this.stats = stats;
    }

    public HypixelBedWarsStats getBedWarsStats() {
        return Optional.ofNullable(bedWarsStats).orElse(bedWarsStats = new HypixelBedWarsStats(stats));
    }

}
