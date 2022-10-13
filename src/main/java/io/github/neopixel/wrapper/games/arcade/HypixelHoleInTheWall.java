package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelHoleInTheWall extends HypixelGame {

    protected HypixelHoleInTheWall(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "HOLE_IN_THE_WALL";
    }

    @Override
    public String getGameName() {
        return "Hole in the Wall";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getRounds() {
        return jsonHandler.getSafeInt("rounds_hole_in_the_wall");
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins_hole_in_the_wall");
    }
}
