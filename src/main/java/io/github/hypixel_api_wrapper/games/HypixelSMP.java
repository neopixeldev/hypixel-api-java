package io.github.hypixel_api_wrapper.games;

public class HypixelSMP implements HypixelGame {
    @Override
    public String getGameID() {
        return "SMP";
    }

    @Override
    public String getGameName() {
        return "SMP";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
