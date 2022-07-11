package io.github.hypixel_api_wrapper.wrapper.games.prototype;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelPrototype implements HypixelGame {
    @Override
    public String getGameID() {
        return "PROTOTYPE";
    }

    @Override
    public String getGameName() {
        return "Prototype";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
