package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
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
    public Optional<Integer> getResourcesCollected() {
        return jsonHandler.getSafeInt("resources_collected_bedwars");
    }

    /**
     * @return The amount of diamonds the player has collected.
     */
    public Optional<Integer> getDiamondsCollected() {
        return jsonHandler.getSafeInt("diamond_resources_collected_bedwars");
    }

    /**
     * @return The amount of emeralds the player has collected.
     */
    public Optional<Integer> getEmeraldsCollected() {
        return jsonHandler.getSafeInt("emerald_resources_collected_bedwars");
    }

    /**
     * @return The amount of gold the player has collected.
     */
    public Optional<Integer> getGoldCollected() {
        return jsonHandler.getSafeInt("gold_resources_collected_bedwars");
    }

    /**
     * @return The amount of iron the player has collected.
     */
    public Optional<Integer> getIronCollected() {
        return jsonHandler.getSafeInt("iron_resources_collected_bedwars");
    }

    public Optional<Integer> getKills(BedWarsKillCause cause) {
        return jsonHandler.getSafeInt(cause.getKey() + "kills_bedwars");
    }

    public Optional<Integer> getDeaths(BedWarsKillCause cause) {
        return jsonHandler.getSafeInt(cause.getKey() + "deaths_bedwars");
    }

    public Optional<Integer> getKillToDeathRatio(BedWarsKillCause cause) {
        return Optional.ofNullable(getKills(cause).get() / Math.max(getDeaths(cause).get(), 1));
    }

    public Optional<Integer> getFinalKills(BedWarsKillCause cause) {
        return jsonHandler.getSafeInt(cause.getKey() + "final_kills_bedwars");
    }

    public Optional<Integer> getFinalDeaths(BedWarsKillCause cause) {
        return jsonHandler.getSafeInt(cause.getKey() + "final_deaths_bedwars");
    }

    public Optional<Integer> getFinalKillToDeathRatio(BedWarsKillCause cause) {
        return Optional.ofNullable(getFinalKills(cause).get() / Math.max(getFinalDeaths(cause).get(), 1));
    }

    /**
     * @return The amount of wins the player has.
     */
    public Optional<Integer> getWins() {
        return jsonHandler.getSafeInt("wins_bedwars");
    }

    /**
     * @return The amount of losses the player has.
     */
    public Optional<Integer> getLosses() {
        return jsonHandler.getSafeInt("losses_bedwars");
    }

    /**
     * @return The player's win to loss ratio.
     */
    public Optional<Integer> getWinToLossRatio() {
        return Optional.ofNullable(getWins().get() / Math.max(getLosses().get(), 1));
    }

    /**
     * @return The amount of beds the player has broken.
     */
    public Optional<Integer> getBedsBroken() {
        return jsonHandler.getSafeInt("beds_broken_bedwars");
    }

    /**
     * @return The amount of items the player has purchased from the shop.
     */

    public Optional<Integer> getItemsPurchasedAmount() {
        return jsonHandler.getSafeInt("items_purchased_bedwars");
    }

    /**
     * @return The amount of games the player has played.
     */
    public Optional<Integer> getGamesPlayed() {
        return jsonHandler.getSafeInt("games_played_bedwars");
    }

    /**
     * @return The player's current winstreak.
     */
    public Optional<Integer> getCurrentWinstreak() {
        return jsonHandler.getSafeInt("winstreak");
    }

}
