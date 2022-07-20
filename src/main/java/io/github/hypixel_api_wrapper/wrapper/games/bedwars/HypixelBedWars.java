package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWars {

    private final String statsPrefix ;
    private final JSONObject stats;
    private final HypixelBedWarsMode mode;

    protected HypixelBedWars(JSONObject stats, HypixelBedWarsMode mode) {
        this.stats = stats;
        this.mode = mode;
        this.statsPrefix  = mode.getStatsPrefix();
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

    public int getItemsPurchasedAmount() {
        return stats.getInt(statsPrefix + "items_purchased_bedwars");
    }

    public int getGamesPlayed() {
        return stats.getInt(statsPrefix + "games_played_bedwars");
    }

    public int getCurrentWinstreak() {
        return stats.getInt(stats + "winstreak");
    }

    /**
     * @return The {@link HypixelBedWarsMode} that the statsPrefix
     * is using. 
     */
    public HypixelBedWarsMode getMode() {
        return mode;
    }
}
