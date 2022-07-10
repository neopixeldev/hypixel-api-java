package io.github.hypixel_api_wrapper.wrapper.games;

public class HypixelWalls3 implements HypixelGame {
    @Override
    public String getGameID() {
        return "WALLS3";
    }

    @Override
    public String getGameName() {
        return "Mega Walls";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
