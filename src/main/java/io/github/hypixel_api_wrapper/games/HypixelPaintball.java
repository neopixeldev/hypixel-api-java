package io.github.hypixel_api_wrapper.games;

public class HypixelPaintball implements HypixelGame {
    @Override
    public String getGameID() {
        return "PAINTBALL";
    }

    @Override
    public String getGameName() {
        return "Paintball";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
