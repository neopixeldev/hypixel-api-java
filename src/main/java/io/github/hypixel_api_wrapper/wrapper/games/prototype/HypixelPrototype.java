package io.github.hypixel_api_wrapper.wrapper.games.prototype;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelPrototype extends HypixelGame {

    protected HypixelPrototype(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "PROTOTYPE";
    }

    @Override
    public String getGameName() {
        return "Prototype";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
