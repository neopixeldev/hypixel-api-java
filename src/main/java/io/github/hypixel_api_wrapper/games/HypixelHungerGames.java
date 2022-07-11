package io.github.hypixel_api_wrapper.games;

public class HypixelHungerGames implements HypixelGame {
    @Override
    public String getGameID() {
        return "SURVIVAL_GAMES";
    }

    @Override
    public String getGameName() {
        return "Blitz Survival Games";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
