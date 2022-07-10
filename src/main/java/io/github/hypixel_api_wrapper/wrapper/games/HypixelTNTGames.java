package io.github.hypixel_api_wrapper.wrapper.games;

public class HypixelTNTGames implements HypixelGame {
    @Override
    public String getGameID() {
        return "TNTGAMES";
    }

    @Override
    public String getGameName() {
        return "TNT Games";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
