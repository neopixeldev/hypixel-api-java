package io.github.hypixel_api_wrapper.wrapper.games.hunger_games;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

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
    public boolean isRemoved() {
        return false;
    }
}
