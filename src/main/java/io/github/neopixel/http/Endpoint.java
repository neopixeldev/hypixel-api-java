package io.github.neopixel.http;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * An enum of endpoints to the Hypixel API.
 */
public enum Endpoint {
    API_KEY("key"),
    BOOSTERS("boosters"),
    LEADERBOARDS("leaderboards"),
    PUNISHMENTS("punishmentstats"),
    GUILD("guild"),

    PLAYER("player"),
    PLAYER_COUNTS("counts"),
    PLAYER_STATUS("status"),
    PLAYER_FRIENDS("friends"),
    PLAYER_RECENT_GAMES("recentgames"),
    PLAYER_RANKED_SKYWARS("player/ranked/skywars"),

    SKYBLOCK_NEWS("skyblock/news"), // DONE
    SKYBLOCK_ELECTIONS("resources/skyblock/election"), // DONE
    SKYBLOCK_LOOKUP_AUCTIONS("skyblock/auction"),
    SKYBLOCK_ACTIVE_AUCTIONS("skyblock/auctions"),
    SKYBLOCK_ENDED_AUCTIONS("skyblock/auctions_ended"),
    SKYBLOCK_BAZAAR("skyblock/bazaar"),
    SKYBLOCK_SINGLE_PROFILE("skyblock/profile"),
    SKYBLOCK_PLAYER_PROFILES("skyblock/profiles"),
    SKYBLOCK_PLAYER_BINGO("skyblock/bingo");


    private final String path;

    Endpoint(String path) {
        this.path = "/" + path;
    }

    public URL getURL() {
        try {
            return new URL("https", "api.hypixel.net", path);
        } catch (MalformedURLException cause) {
            throw new IllegalStateException("Invalid path for " + name() + ": \"" + path + "\"");
        }
    }
}