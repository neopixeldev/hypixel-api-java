package io.github.hypixel_api_wrapper.wrapper.player;

import io.github.hypixel_api_wrapper.http.RequestController;
import io.github.hypixel_api_wrapper.http.RequestFactory;
import java.time.Instant;
import java.util.UUID;

/**
 * This class is used to link two {@link HypixelPlayer}'s as friends on the Hypixel network.
 *
 * @author sam & insert
 */
public class HypixelFriend {

    private final UUID friend;
    private final UUID requestSender;
    private final UUID requestReciever;
    private final Instant dateAdded;
    private final RequestController requestController;

    public HypixelFriend(UUID friend, UUID requestSender, UUID requestReciever, Instant dateAdded,
        RequestController requestController) {
        this.friend = friend;
        this.requestSender = requestSender;
        this.requestReciever = requestReciever;
        this.dateAdded = dateAdded;
        this.requestController = requestController;
    }

    public HypixelPlayer asPlayer() {
        return new HypixelPlayer(friend, requestController);
    }

    public UUID getRequestSender() {
        return requestSender;
    }

    public UUID getRequestReciever() {
        return requestReciever;
    }

    /**
     * @return The date the {@player} added the {@friend} as a friend on the network.
     */
    public Instant getDateAdded() {
        return dateAdded;
    }
}
