package io.github.hypixel_api_wrapper.wrapper.games.mcgo;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelMCGO implements HypixelGame {
    @Override
    public String getGameID() {
        return "MCGO";
    }

    @Override
    public String getGameName() {
        return "Cops and Crims";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
