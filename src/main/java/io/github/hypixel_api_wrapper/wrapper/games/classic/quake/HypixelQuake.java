package io.github.hypixel_api_wrapper.wrapper.games.classic.quake;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelQuake implements HypixelGame {
    @Override
    public String getGameID() {
        return "QUAKECRAFT";
    }

    @Override
    public String getGameName() {
        return "Quake";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
