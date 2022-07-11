package io.github.hypixel_api_wrapper.wrapper.games.build_battle;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

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
    public boolean isPresentOnNetwork() {
        return true;
    }
}
