package io.github.hypixel_api_wrapper.wrapper.games;

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
