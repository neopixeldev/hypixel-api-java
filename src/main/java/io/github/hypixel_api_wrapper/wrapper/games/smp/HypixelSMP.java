package io.github.hypixel_api_wrapper.wrapper.games.smp;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelSMP implements HypixelGame {
    @Override
    public String getGameID() {
        return "SMP";
    }

    @Override
    public String getGameName() {
        return "SMP";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
