package io.github.hypixel_api_wrapper.wrapper.games.skyblock;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelSkyblock implements HypixelGame {
    @Override
    public String getGameID() {
        return "SKYBLOCK";
    }

    @Override
    public String getGameName() {
        return "SkyBlock";
    }

    @Override
    public boolean isPresentOnNetwork() {
        return true;
    }
}
