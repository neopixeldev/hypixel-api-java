package io.github.neopixel.wrapper.games.duels;

import io.github.neopixel.wrapper.HypixelLootChestGame;
import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.games.bedwars.HypixelBedWars;
import io.github.neopixel.wrapper.games.bedwars.HypixelBedWarsMode;
import io.github.neopixel.wrapper.util.JSONHandler;

/**
 * A player's overall stats for the duels.
 * <p>
 * To get their stats for a particular {@link HypixelDuelsModes mode}, use the
 * {@link #getMode(HypixelDuelsModes) getMode()} method.
 */
public class HypixelDuelsStats extends HypixelGame implements HypixelLootChestGame {

    protected HypixelDuelsStats(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "DUELS";
    }

    @Override
    public String getGameName() {
        return "Duels";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    /**
     * Gets the player's stats for a particular Duels mode.
     *
     * @param mode The mode to get the player's stats for.
     * @return The player's stats for that mode.
     */
    public HypixelDuels getMode(HypixelDuelsModes mode) {
        return new HypixelDuels(
            jsonHandler.getThisJSONHandlerWithStatsPrefix(mode.getStatsPrefix()));
    }

    @Override
    public int getOpenedChestsAmount() {
        return 0;
    }

    @Override
    public int getOpenedCommonChestsAmount() {
        return 0;
    }

    @Override
    public int getOpenedRareChestsAmount() {
        return 0;
    }

    @Override
    public int getOpenedEpicChestsAmount() {
        return 0;
    }

    @Override
    public int getOpenedLegendaryChestsAmount() {
        return 0;
    }
}
