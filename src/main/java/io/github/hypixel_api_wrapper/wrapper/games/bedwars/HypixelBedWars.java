package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWars {

    private final String statsPrefix ;
    private final JSONObject stats;

    protected HypixelBedWars(JSONObject stats, HypixelBedWarsMode mode) {
        this.statsPrefix  = mode.getStatsPrefix();
        this.stats = stats;
    }

    public int getResourcesCollected() {
        return stats.getInt(stats + "resources_collected_bedwars");
    }
    public int getDiamondsCollected() {
        return stats.getInt(stats + "diamond_resources_collected_bedwars");
    }

    public int getEmeraldsCollected() {
        return stats.getInt(stats + "emerald_resources_collected_bedwars");
    }

    public int getGoldCollected() {
        return stats.getInt(stats + "gold_resources_collected_bedwars");
    }

    public int getIronCollected() {
        return stats.getInt(stats + "iron_resources_collected_bedwars");
    }

    public int getKills(BedWarsKillCause cause) {
        return stats.getInt(statsPrefix + cause.getKey() + "kills_bedwars");
    }

    public int getDeaths(BedWarsKillCause cause) {
        return stats.getInt(statsPrefix + cause.getKey() + "deaths_bedwars");
    }

    public double getKillToDeathRatio(BedWarsKillCause cause) {
        return getKills(cause) / Math.max(getDeaths(cause), 1);
    }

    public int getFinalKills(BedWarsKillCause cause) {
        return stats.getInt(statsPrefix + cause.getKey() + "final_kills_bedwars");
    }

    public int getFinalDeaths(BedWarsKillCause cause) {
        return stats.getInt(statsPrefix + cause.getKey() + "final_deaths_bedwars");
    }

    public double getFinalKillToDeathRatio(BedWarsKillCause cause) {
        return getFinalKills(cause) / Math.max(getFinalDeaths(cause), 1);
    }

    public int getWins() {
        return stats.getInt(statsPrefix + "wins_bedwars");
    }

    public int getLosses() {
        return stats.getInt(statsPrefix + "losses_bedwars");
    }

    public double getWinToLossRatio() {
        return getWins() / Math.max(getLosses(), 1);
    }

    public int getBedsBroken() {
        return stats.getInt(statsPrefix + "beds_broken_bedwars");
    }

    public int getItemsPurchasedAmount() {
        return stats.getInt(statsPrefix + "items_purchased_bedwars");
    }

    public int getGamesPlayed() {
        return stats.getInt(statsPrefix + "games_played_bedwars");
    }

    public int getCurrentWinstreak() {
        return stats.getInt(stats + "winstreak");
    }
}
