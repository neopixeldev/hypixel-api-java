package io.github.hypixel_api_wrapper.wrapper.games;

public class HypixelSkyblock implements HypixelGame {
    @Override
    public String getGameID() {
        return "SKYBLOCK";
    }

    @Override
    public String getGameName() {
        return "SkyBlock";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
