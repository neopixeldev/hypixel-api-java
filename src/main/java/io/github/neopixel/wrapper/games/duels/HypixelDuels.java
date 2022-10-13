package io.github.neopixel.wrapper.games.duels;

import io.github.neopixel.wrapper.HypixelLootChestGame;
import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.Optional;

public class HypixelDuels {

    private final JSONHandler jsonHandler;
    protected HypixelDuels(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins");
    }

    public int getLosses() {
        return jsonHandler.getSafeInt("losses");
    }

    public int getWinToLossRatio() {
        return getWins() / Math.max(getLosses(), 1);
    }

    public int getKills() {
        return jsonHandler.getSafeInt("kills");
    }

    public int getDeaths() {
        return jsonHandler.getSafeInt("deaths");
    }

    public int getKillToDeathRatio() {
        return getKills() / Math.max(getDeaths(), 1);
    }

    public int getMeleeSwings() {
        return jsonHandler.getSafeInt("melee_swings");
    }

    public int getMeleeHits() {
        return jsonHandler.getSafeInt("melee_hits");
    }

    public int getBowShots() {
        return jsonHandler.getSafeInt("bow_shots");
    }

    public int getBowHits() {
        return jsonHandler.getSafeInt("bow_hits");
    }

    public int getDamageDealt() {
        return jsonHandler.getSafeInt("damage_dealt");
    }

    public int getHealthRegenerated() {
        return jsonHandler.getSafeInt("health_regenerated");
    }

    public int getRoundsPlayed() {
        return jsonHandler.getSafeInt("rounds_played");
    }

    /**
     * Used for bridge modes only.
     * @return The amount of goals a player has in the specific <bold>bridge</bold> mode.
     */
    public int getGoals() {
        return jsonHandler.getSafeInt("goals");
    }

}
