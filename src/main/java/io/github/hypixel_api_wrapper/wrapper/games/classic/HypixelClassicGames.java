package io.github.hypixel_api_wrapper.wrapper.games.classic;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import org.json.JSONObject;

public class HypixelClassicGames extends HypixelGame {

    protected HypixelClassicGames(JSONHandler jsonHandler) {
        super(jsonHandler);
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
