package io.github.hypixel_api_wrapper.games;

public class HypixelPit implements HypixelGame {
    @Override
    public String getGameID() {
        return "PIT";
    }

    @Override
    public String getGameName() {
        return "Pit";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
