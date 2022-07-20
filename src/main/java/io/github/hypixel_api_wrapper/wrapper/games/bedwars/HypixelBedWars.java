package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

/**
 * Retrieves data from a {@link JSONObject} about a specific BedWars sub-mode for a player. Each
 * methods uses a prefix to retrieve the information from the correct mode. Use the
 * {@link HypixelBedWarsMode} enum to specify which mode it should be using.
 */
public class HypixelBedWars {

    private final String statsPrefix;
    private final JSONObject stats;

    protected HypixelBedWars(JSONObject stats, HypixelBedWarsMode mode) {
        this.statsPrefix = mode.getStatsPrefix();
        this.stats = stats;
    }

    /**
     * @return The amount of resources the player has collected.
     */
    public int getResourcesCollected() {
        return stats.getInt(stats + "resources_collected_bedwars");
    }

    /**
     * @return The amount of diamonds the player has collected.
     */
    public int getDiamondsCollected() {
        return stats.getInt(stats + "diamond_resources_collected_bedwars");
    }

    /**
     * @return The amount of emeralds the player has collected.
     */
    public int getEmeraldsCollected() {
        return stats.getInt(stats + "emerald_resources_collected_bedwars");
    }

    /**
     * @return The amount of gold the player has collected.
     */
    public int getGoldCollected() {
        return stats.getInt(stats + "gold_resources_collected_bedwars");
    }

    /**
     * @return The amount of iron the player has collected.
     */
    public int getIronCollected() {
        return stats.getInt(stats + "iron_resources_collected_bedwars");
    }

    public int getKills() {
        throw new UnsupportedOperationException();
    }

    public int getDeaths() {
        throw new UnsupportedOperationException();
    }

    public double getKillToDeathRatio() {
        return getKills() / Math.max(getDeaths(), 1);
    }

    public int getFinalKills() {
        throw new UnsupportedOperationException();
    }

    public int getFinalDeaths() {
        throw new UnsupportedOperationException();
    }

    public double getFinalKillToDeathRatio() {
        return getFinalKills() / Math.max(getFinalDeaths(), 1);
    }

    /**
     * @return The amount of wins the player has.
     */
    public int getWins() {
        return stats.getInt(statsPrefix + "wins_bedwars");
    }

    /**
     * @return The amount of losses the player has.
     */
    public int getLosses() {
        return stats.getInt(statsPrefix + "losses_bedwars");
    }

    /**
     * @return The players win to loss ratio.
     */
    public double getWinToLossRatio() {
        return getWins() / Math.max(getLosses(), 1);
    }

    /**
     * @return The amount of beds the player has broken.
     */
    public int getBedsBroken() {
        return stats.getInt(statsPrefix + "beds_broken_bedwars");
    }

    public int getVoidKills() {
        throw new UnsupportedOperationException();
    }

    public int getVoidFinalKills() {
        throw new UnsupportedOperationException();
    }

    public int getProjectileDeaths() {
        throw new UnsupportedOperationException();
    }

    public int getProjectileKills() {
        throw new UnsupportedOperationException();
    }

    /**
     * @return The amount of items the player has purchased from the shop.
     */
    public int getItemsPurchasedAmount() {
        return stats.getInt(statsPrefix + "items_purchased_bedwars");
    }

    /**
     * @return The amount of games the player has played.
     */
    public int getGamesPlayed() {
        return stats.getInt(statsPrefix + "games_played_bedwars");
    }

    /**
     * @return The players current winstreak.
     */
    public int getCurrentWinstreak() {
        return stats.getInt(stats + "winstreak");
    }
}
