package io.github.hypixel_api_wrapper.wrapper.games.super_smash;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelSuperSmash implements HypixelGame {
    @Override
    public String getGameID() {
        return "SUPER_SMASH";
    }

    @Override
    public String getGameName() {
        return "Smash Heros";
    }

    @Override
    public boolean isPresentOnNetwork() {
        return true;
    }
}
