package io.github.hypixel_api_wrapper.wrapper.guild;

import io.github.hypixel_api_wrapper.http.RequestController;
import io.github.hypixel_api_wrapper.http.RequestFactory;
import io.github.hypixel_api_wrapper.wrapper.player.HypixelPlayer;
import java.util.List;

public class HypixelGuild {

    private final String name;
    private final RequestController requestFactory;

    public HypixelGuild(String name, RequestController requestFactory) {
        this.name = name;
        this.requestFactory = requestFactory;
    }

    public String getName() {
        return name;
    }

    public double getLevel() {
        throw new UnsupportedOperationException();
    }

    public double getExperience() {
        throw new UnsupportedOperationException();
    }

    public List<HypixelPlayer> getMembers() {
        throw new UnsupportedOperationException();
    }

    public HypixelPlayer getOwner() {
        throw new UnsupportedOperationException();
    }

    public long getDailyGEXP() {
        throw new UnsupportedOperationException();
    }

    public boolean isPubliclyListed() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public boolean isJoinable() {
        throw new UnsupportedOperationException();
    }

    public int getCoins() {
        throw new UnsupportedOperationException();
    }

    public String getTag() {
        throw new UnsupportedOperationException();
    }

    public int getPlacementOnLeaderboard() {
        throw new UnsupportedOperationException();
    }
}
