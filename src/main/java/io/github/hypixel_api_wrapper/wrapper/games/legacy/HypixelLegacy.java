package io.github.hypixel_api_wrapper.wrapper.games.legacy;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelLegacy implements HypixelGame {
    @Override
    public String getGameID() {
        return "LEGACY";
    }

    @Override
    public String getGameName() {
        return "Classic Games";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
