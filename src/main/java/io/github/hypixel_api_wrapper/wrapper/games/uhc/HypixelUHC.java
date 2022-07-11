package io.github.hypixel_api_wrapper.wrapper.games.uhc;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelUHC implements HypixelGame {
    @Override
    public String getGameID() {
        return "UHC";
    }

    @Override
    public String getGameName() {
        return "UHC Champions";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
