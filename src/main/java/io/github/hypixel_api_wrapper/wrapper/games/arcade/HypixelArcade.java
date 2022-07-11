package io.github.hypixel_api_wrapper.wrapper.games.arcade;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelArcade implements HypixelGame {
    @Override
    public String getGameID() {
        return "ARCADE";
    }

    @Override
    public String getGameName() {
        return "Arcade";
    }

    @Override
    public boolean isPresentOnNetwork() {
        return true;
    }
}
