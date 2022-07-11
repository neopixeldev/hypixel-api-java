package io.github.hypixel_api_wrapper.wrapper.games.walls;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelWalls implements HypixelGame {
    @Override
    public String getGameID() {
        return "WALLS";
    }

    @Override
    public String getGameName() {
        return "Walls";
    }

    @Override
    public boolean isPresentOnNetwork() {
        return false;
    }
}
