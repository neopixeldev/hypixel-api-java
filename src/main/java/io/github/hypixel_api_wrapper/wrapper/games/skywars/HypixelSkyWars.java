package io.github.hypixel_api_wrapper.wrapper.games.skywars;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelSkyWars implements HypixelGame {
    @Override
    public String getGameID() {
        return "SKYWARS";
    }

    @Override
    public String getGameName() {
        return "SkyWars";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
