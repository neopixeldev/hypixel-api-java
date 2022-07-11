package io.github.hypixel_api_wrapper.games;

public class HypixelWalls implements HypixelGame {
    @Override
    public String getGameID() {
        return "WALLS";
    }

    @Override
    public String getGameName() {
        return "Walls";
    }

    @Override
    public boolean isNetworkPresent() {
        return false;
    }
}
