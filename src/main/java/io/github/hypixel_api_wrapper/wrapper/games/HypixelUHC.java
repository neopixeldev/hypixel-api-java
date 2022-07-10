package io.github.hypixel_api_wrapper.wrapper.games;

public class HypixelUHC implements HypixelGame {
    @Override
    public String getGameID() {
        return "UHC";
    }

    @Override
    public String getGameName() {
        return "UHC Champions";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
