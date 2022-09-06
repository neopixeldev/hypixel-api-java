package io.github.hypixel_api_wrapper.wrapper.games.tnt_games;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import org.json.JSONObject;

public class HypixelTNTGames extends HypixelGame {

    protected HypixelTNTGames(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "TNTGAMES";
    }

    @Override
    public String getGameName() {
        return "TNT Games";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
