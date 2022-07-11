package io.github.hypixel_api_wrapper.wrapper.games.murder_mystery;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelMurderMystery implements HypixelGame {
    @Override
    public String getGameID() {
        return "MURDER_MYSTERY";
    }

    @Override
    public String getGameName() {
        return "Murder Mystery";
    }

    @Override
    public boolean isPresentOnNetwork() {
        return true;
    }
}
