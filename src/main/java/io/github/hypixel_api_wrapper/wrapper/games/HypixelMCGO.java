package io.github.hypixel_api_wrapper.wrapper.games;

public class HypixelMCGO implements HypixelGame {
    @Override
    public String getGameID() {
        return "MCGO";
    }

    @Override
    public String getGameName() {
        return "Cops and Crims";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
