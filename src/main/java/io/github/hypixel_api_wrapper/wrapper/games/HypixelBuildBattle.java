package io.github.hypixel_api_wrapper.wrapper.games;

public class HypixelBuildBattle implements HypixelGame {
    @Override
    public String getGameID() {
        return "BUILD_BATTLE";
    }

    @Override
    public String getGameName() {
        return "Build Battle";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
