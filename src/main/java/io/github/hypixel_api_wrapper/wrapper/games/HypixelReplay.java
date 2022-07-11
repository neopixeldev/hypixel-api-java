package io.github.hypixel_api_wrapper.wrapper.games;

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
    public boolean isRemoved() {
        return false;
    }
}
