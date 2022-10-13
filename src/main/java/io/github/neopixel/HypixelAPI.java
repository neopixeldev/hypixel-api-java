package io.github.neopixel;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.guild.HypixelGuild;
import io.github.neopixel.wrapper.player.HypixelPlayer;
import java.io.File;
import java.util.UUID;
import okhttp3.Cache;

public class HypixelAPI {

    private final RequestController requestController;

    private HypixelAPI(UUID key) {
        this.requestController = new RequestController(key);
    }

    private HypixelAPI(UUID key, Cache cache) {
        this.requestController = new RequestController(key, cache);
    }

    /**
     * Creates a new instance of the HypixelAPI object with caching disabled.
     *
     * @param key the api key to use for authentication
     * @return the newly created instance
     */
    public static HypixelAPI create(UUID key) {
        return new HypixelAPI(key);
    }

    /**
     * Creates a new instance of the HypixelAPI object with caching enabled.
     *
     * @param key the api key to use for authentication
     * @return the newly created instance
     */
    public static HypixelAPI create(UUID key, Cache cache) {
        return new HypixelAPI(key, cache);
    }

    public static HypixelAPI createWithDefaultCaching(UUID key) {
        File httpCacheDirectory = new File("./cacheDir", "http-cache");
        int cacheSize = 10 * 1024 * 1024; // 10 MiB
        Cache cache = new Cache(httpCacheDirectory, cacheSize);
        return new HypixelAPI(key, cache);
    }



    public HypixelPlayer getPlayerByName(String username) {
        return new HypixelPlayer(username, requestController);
    }

    public HypixelGuild getGuildByName(String name) {
        return new HypixelGuild(name, requestController);
    }
}