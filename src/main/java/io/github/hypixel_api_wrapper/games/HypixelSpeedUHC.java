package io.github.hypixel_api_wrapper.games;

public class HypixelSpeedUHC implements HypixelGame {
    @Override
    public String getGameID() {
        return "SPEED_UHC";
    }

    @Override
    public String getGameName() {
        return "SpeedUHC";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
