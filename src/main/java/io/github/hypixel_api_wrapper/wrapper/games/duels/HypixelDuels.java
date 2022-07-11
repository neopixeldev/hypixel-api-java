package io.github.hypixel_api_wrapper.wrapper.games.duels;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelDuels implements HypixelGame {
    @Override
    public String getGameID() {
        return "DUELS";
    }

    @Override
    public String getGameName() {
        return "Duels";
    }

    @Override
    public boolean isPresentOnNetwork() {
        return true;
    }
}
