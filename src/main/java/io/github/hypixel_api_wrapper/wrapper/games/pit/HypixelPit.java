package io.github.hypixel_api_wrapper.wrapper.games.pit;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelPit implements HypixelGame {
    @Override
    public String getGameID() {
        return "PIT";
    }

    @Override
    public String getGameName() {
        return "Pit";
    }

    @Override
    public boolean isPresentOnNetwork() {
        return true;
    }
}
