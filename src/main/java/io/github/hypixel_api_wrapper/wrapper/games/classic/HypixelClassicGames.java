package io.github.hypixel_api_wrapper.wrapper.games.classic;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelClassicGames extends HypixelGame {

    protected HypixelClassicGames(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "LEGACY";
    }

    @Override
    public String getGameName() {
        return "Classic Games";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
