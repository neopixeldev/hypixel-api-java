package io.github.hypixel_api_wrapper.games;

public class HypixelReplay implements HypixelGame {
    @Override
    public String getGameID() {
        return "REPLAY";
    }

    @Override
    public String getGameName() {
        return "Replay";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
