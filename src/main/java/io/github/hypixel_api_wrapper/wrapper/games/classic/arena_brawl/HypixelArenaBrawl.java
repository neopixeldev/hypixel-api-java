package io.github.hypixel_api_wrapper.wrapper.games.classic.arena_brawl;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import org.json.JSONObject;

public class HypixelArenaBrawl extends HypixelGame {

    protected HypixelArenaBrawl(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "ARENA";
    }

    @Override
    public String getGameName() {
        return "Arena Brawl";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
