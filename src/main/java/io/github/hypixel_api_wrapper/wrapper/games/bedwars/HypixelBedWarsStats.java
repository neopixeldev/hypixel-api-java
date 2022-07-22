package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import io.github.hypixel_api_wrapper.wrapper.HypixelLootChestGame;
import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

/**
 * A player's overall stats for the game Bed Wars.
 * <p>
 * To get their stats for a particular {@link HypixelBedWarsMode mode}, use
 * {@link #getMode(HypixelBedWarsMode) getMode}.
 */
public class HypixelBedWarsStats extends HypixelGame implements HypixelLootChestGame {

    public HypixelBedWarsStats(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "BEDWARS";
    }

    @Override
    public String getGameName() {
        return "Bed Wars";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    /**
     * Gets the player's stats for a particular Bed Wars {@link HypixelBedWarsMode mode}.
     *
     * @param mode The mode to get the player's stats for.
     * @return The player's stats for that {@code mode}.
     */
    public HypixelBedWars getMode(HypixelBedWarsMode mode) {
        return new HypixelBedWars(stats, mode);
    }

    /**
     * Coins are earned by winning, killing other players, breaking beds, and completing quests.
     * They can be used to purchase Bed Wars cosmetics, such as shopkeeper skins and victory dances.
     *
     * @return The total number of Bed Wars coins the player currently has.
     */
    public final int getCoins() {
        return stats.getInt("coins");
    }

/**
     * Players increase their Bed Wars level by gaining {@link #getExperience() experience}. The
     * higher the level, the more experience is required to move to the next level. Every 100
     * levels, a player advances to the next prestige.
     *
     * @return The player's current Bed Wars level.
     */
    public final int getLevel() {
        return stats.getInt("level");
    }

    /**
     * Experience can be obtained from playing BedWars. Kills, bed-breaks, quest completions, wins,
     * and more add Experience to the players profile. It directly corrolates to the players level.
     *
     * @return The amount of BedWars experience the player has.
     */
    public final int getExperience() {
        throw new UnsupportedOperationException();
    }

    /**
     * When a player wins a game, their currently selected victory dance is activated. Victory
     * dances can be bought with coins.
     *
     * @return The players currently selected victory dance.
     */
    public final String getActiveVictoryDance() {
        throw new UnsupportedOperationException();
    }

    /**
     * An island topper is a structure placed on top of a players base.
     *
     * @return The players currently selected island topper.
     */
    public final String getActiveIslandTopper() {
        throw new UnsupportedOperationException();
    }

    /**
     * a spray is a picture applied to item frames all over a map.
     *
     * @return The players currently selected spray.
     */
    public final String getActiveSpray() {
        throw new UnsupportedOperationException();
    }

    //TODO is it a final death or just a normal death?

    /**
     * When a player dies their selected death cry is activated.
     *
     * @return The players currently selected death cry.
     */
    public final String getActiveDeathCry() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getOpenedChestsAmount() {
        return stats.getInt("Bedwars_openedChests");
    }

    @Override
    public int getOpenedCommonChestsAmount() {
        return stats.getInt("Bedwars_openedCommons");
    }

    @Override
    public int getOpenedRareChestsAmount() {
        return stats.getInt("Bedwars_openedRares");
    }

    @Override
    public int getOpenedEpicChestsAmount() {
        return stats.getInt("Bedwars_openedEpics");
    }

    @Override
    public int getOpenedLegendaryChestsAmount() {
        return stats.getInt("Bedwars_openedLegendaries");
    }
}
