package io.github.hypixel_api_wrapper.wrapper.games;

public class HypixelHousing implements HypixelGame {
    @Override
    public String getGameID() {
        return "HOUSING";
    }

    @Override
    public String getGameName() {
        return "Housing";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
