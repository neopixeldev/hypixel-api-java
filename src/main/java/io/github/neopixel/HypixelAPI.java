package io.github.neopixel;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.guild.HypixelGuild;
import io.github.neopixel.wrapper.player.HypixelPlayer;
import java.util.UUID;

public class HypixelAPI {

    private final RequestController requestController;

    private HypixelAPI(UUID key) {
        this.requestController = new RequestController(key);
    }

    /**
     * Creates a new instance of the HypixelAPI object with caching disabled.
     *
     * @param key the api key to use for authentication
     * @return the newly created instance
     */
    public static HypixelAPI create(UUID key) {
        return create(key);
    }


    public HypixelPlayer getPlayerByName(String username) {
        return new HypixelPlayer(username, requestController);
    }

    public HypixelGuild getGuildByName(String name) {
        return new HypixelGuild(name, requestController);
    }
}