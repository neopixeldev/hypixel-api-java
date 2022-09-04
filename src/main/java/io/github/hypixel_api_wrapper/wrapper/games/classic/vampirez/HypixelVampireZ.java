package io.github.hypixel_api_wrapper.wrapper.games.classic.vampirez;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import org.json.JSONObject;

public class HypixelVampireZ extends HypixelGame {

    protected HypixelVampireZ(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "VAMPIREZ";
    }

    @Override
    public String getGameName() {
        return "VampireZ";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
