package io.github.neopixel.wrapper.games.bedwars;

import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.Optional;

/**
 * Retrieves data about a particular BedWars mode.
 * Use a {@link HypixelBedWarsMode} to specify the mode.
 */
public class HypixelBedWars {

    private final JSONHandler jsonHandler;

    protected HypixelBedWars(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    /**
     * @return The amount of resources the player has collected.
     */
    public int getResourcesCollected() {
        return jsonHandler.getSafeInt("resources_collected_bedwars");
    }

    /**
     * @return The amount of diamonds the player has collected.
     */
    public int getDiamondsCollected() {
        return jsonHandler.getSafeInt("diamond_resources_collected_bedwars");
    }

    /**
     * @return The amount of emeralds the player has collected.
     */
    public int getEmeraldsCollected() {
        return jsonHandler.getSafeInt("emerald_resources_collected_bedwars");
    }

    /**
     * @return The amount of gold the player has collected.
     */
    public int getGoldCollected() {
        return jsonHandler.getSafeInt("gold_resources_collected_bedwars");
    }

    /**
     * @return The amount of iron the player has collected.
     */
    public int getIronCollected() {
        return jsonHandler.getSafeInt("iron_resources_collected_bedwars");
    }

    public int getKills(BedWarsKillCause cause) {
        return jsonHandler.getSafeInt(cause.getKey() + "kills_bedwars");
    }

    public int getDeaths(BedWarsKillCause cause) {
        return jsonHandler.getSafeInt(cause.getKey() + "deaths_bedwars");
    }

    public int getKillToDeathRatio(BedWarsKillCause cause) {
        return getKills(cause) / Math.max(getDeaths(cause), 1);
    }

    public int getFinalKills(BedWarsKillCause cause) {
        return jsonHandler.getSafeInt(cause.getKey() + "final_kills_bedwars");
    }

    public int getFinalDeaths(BedWarsKillCause cause) {
        return jsonHandler.getSafeInt(cause.getKey() + "final_deaths_bedwars");
    }

    public int getFinalKillToDeathRatio(BedWarsKillCause cause) {
        return getFinalKills(cause) / Math.max(getFinalDeaths(cause), 1);
    }

    /**
     * @return The amount of wins the player has.
     */
    public int getWins() {
        return jsonHandler.getSafeInt("wins_bedwars");
    }

    /**
     * @return The amount of losses the player has.
     */
    public int getLosses() {
        return jsonHandler.getSafeInt("losses_bedwars");
    }

    /**
     * @return The player's win to loss ratio.
     */
    public int getWinToLossRatio() {
        return getWins() / Math.max(getLosses(), 1);
    }

    /**
     * @return The amount of beds the player has broken.
     */
    public int getBedsBroken() {
        return jsonHandler.getSafeInt("beds_broken_bedwars");
    }

    /**
     * @return The amount of items the player has purchased from the shop.
     */

    public int getItemsPurchasedAmount() {
        return jsonHandler.getSafeInt("items_purchased_bedwars");
    }

    /**
     * @return The amount of games the player has played.
     */
    public int getGamesPlayed() {
        return jsonHandler.getSafeInt("games_played_bedwars");
    }

    /**
     * @return The player's current winstreak.
     */
    public int getCurrentWinstreak() {
        return jsonHandler.getSafeInt("winstreak");
    }

}
