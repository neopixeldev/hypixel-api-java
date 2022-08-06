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
     * Gets the player's stats for a particular BedWars mode.
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
     * Experience is accumulated while playing Bed Wars, especially by winning games, breaking beds,
     * and completing quests. The more experience a player earns, the more they
     * {@link #getLevel() level up}.
     *
     * @return The player's total Bed Wars experience.
     */
    public final int getExperience() {
        return stats.getInt("Experience");
    }

    /**
     * The effect played when the player wins a game. Victory dances are bought with
     * {@link #getCoins() coins} from the Bed Wars shop, or found randomly in
     * {@link #getOpenedChestsAmount() loot boxes}.
     * 
     * @return The ID of the effect played when the player wins.
     */
    public final String getActiveVictoryDance() {
        return stats.getString("activeVictoryDance");
    }

    /**
     * A little structure that appears on top of the player's island. Island toppers are bought with
     * {@link #getCoins() coins} from the Bed Wars shop, or found randomly in
     * {@link #getOpenedChestsAmount() loot boxes}.
     * 
     * @return The ID of the player's selected island topper.
     */
    public final String getActiveIslandTopper() {
        return stats.getString("activeIslandTopper");
    }

    /**
     * An image that the player can place in various spots around Bed Wars maps. Sprays are bought
     * with {@link #getCoins() coins} from the Bed Wars shop, or found randomly in
     * {@link #getOpenedChestsAmount() loot boxes}.
     *
     * @return The ID of the player's selected spray.
     */
    public final String getActiveSpray() {
        return stats.getString("activeSprays");
    }

    /**
     * An effect played when the player is killed. Death cries are bought with
     * {@link #getCoins() coins} from the Bed Wars shop, or found randomly in
     * {@link #getOpenedChestsAmount() loot boxes}.
     *
     * @return The ID of the effect played when the player dies.
     */
    public final String getActiveDeathCry() {
        return stats.getString("activeDeathCry");
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
