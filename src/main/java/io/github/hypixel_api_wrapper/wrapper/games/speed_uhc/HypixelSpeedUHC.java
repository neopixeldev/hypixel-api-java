package io.github.hypixel_api_wrapper.wrapper.games.speed_uhc;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

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
