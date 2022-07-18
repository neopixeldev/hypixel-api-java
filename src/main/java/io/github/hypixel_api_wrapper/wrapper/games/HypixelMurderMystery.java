package io.github.hypixel_api_wrapper.wrapper.games;

public class HypixelMurderMystery implements HypixelGame {
    @Override
    public String getGameID() {
        return "MURDER_MYSTERY";
    }

    @Override
    public String getGameName() {
        return "Murder Mystery";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
