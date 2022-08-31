package io.github.hypixel_api_wrapper.wrapper.player;

import io.github.hypixel_api_wrapper.http.RequestFactory;
import java.time.Instant;

/**
 * This class is used to link two {@link HypixelPlayer}'s as friends on the Hypixel network.
 *
 * @author sam & insert
 */
public class HypixelFriend {
    private final HypixelPlayer friend;
    private final Instant dateAdded;
    public HypixelFriend(HypixelPlayer friend, Instant dateAdded) {
        this.friend = friend;
        this.dateAdded = dateAdded;
    }

    public HypixelPlayer asPlayer() {
        return friend;
    }

    /**
     * @return The date the {@player} added the {@friend} as a friend on the network.
     */
    public Instant getDateAdded() {
        return dateAdded;
    }
}
