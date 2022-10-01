package io.github.neopixel.wrapper.player;

import io.github.neopixel.wrapper.games.bedwars.HypixelBedWarsStats;
import io.github.neopixel.wrapper.util.JSONHandler;

/**
 * Used to keep track of a {@link HypixelPlayer}'s statistics on the
 * Hypixel Network.
 */
public class HypixelPlayerGames {

    private final JSONHandler jsonHandler;

    public HypixelPlayerGames(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }
    public HypixelBedWarsStats getBedWarsStats() {
        return new HypixelBedWarsStats(jsonHandler.getJSONHandler("Bedwars"));
    }
}
