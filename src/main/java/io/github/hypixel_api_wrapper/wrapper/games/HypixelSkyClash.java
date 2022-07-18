package io.github.hypixel_api_wrapper.wrapper.games;

public class HypixelSkyClash implements HypixelGame {
    @Override
    public String getGameID() {
        return "SKYCLASH";
    }

    @Override
    public String getGameName() {
        return "SkyClash";
    }

    @Override
    public boolean isNetworkPresent() {
        return false;
    }
}
