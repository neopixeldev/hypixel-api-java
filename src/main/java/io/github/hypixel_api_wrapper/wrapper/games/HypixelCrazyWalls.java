package io.github.hypixel_api_wrapper.wrapper.games;

public class HypixelCrazyWalls implements HypixelGame {
    @Override
    public String getGameID() {
        return "TRUE_COMBAT";
    }

    @Override
    public String getGameName() {
        return "TrueCombat";
    }

    @Override
    public boolean isNetworkPresent() {
        return false;
    }
}
