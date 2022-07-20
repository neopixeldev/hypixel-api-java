package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import io.github.hypixel_api_wrapper.wrapper.HypixelLootChestGame;
import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

/**
 * Used to retrieve information about a players BedWars stats. The methods in this class fetch
 * information about a players statistics that apply to all of BedWars, not a specific mode.
 * It can also be used to retrieve data about sub-modes of BedWars.
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
     * Instantiates and returns a {@link HypixelBedWars}.
     *
     * @param mode The sub-mode of BedWars that the {@link HypixelBedWars} will reference when
     *             retrieving information.
     * @return A {@link HypixelBedWars} that holds a {@link JSONObject} and
     * {@link HypixelBedWarsMode} that will be used to fetch data from the API.
     */
    public HypixelBedWars getMode(HypixelBedWarsMode mode) {
        return new HypixelBedWars(stats, mode);
    }

    /**
     * Coins can be obtained from playing BedWars. Kills, bed-breaks, quest completions, wins, and
     * more add coins to the players profile. They can be used to purchase BedWars cosmetics.
     *
     * @return The amount of BedWars coins the player has.
     */
    public final int getCoins() {
        return stats.getInt("coins");
    }

    /**
     * A players BedWars level is simply their experience converted into a smaller integer. The
     * amount of experience required to level up exponentially grows. Every 100 levels the player is
     * prestieged.
     *
     * @return The players BedWars level. (AKA star)
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
     * When a player wins a game, their currently selected victory dance is activated.
     * Victory dances can be bought with coins.
     * @return The players currently selected victory dance.
     */
    public final String getActiveVictoryDance() {
        throw new UnsupportedOperationException();
    }

    /**
     * An island topper is a structure placed on top of a players base.
     * @return The players currently selected island topper.
     */
    public final String getActiveIslandTopper() {
        throw new UnsupportedOperationException();
    }

    //TODO no idea what this is
    public final String getActiveSprays() {
        throw new UnsupportedOperationException();
    }

    //TODO is it a final death or just a normal death?
    /**
     * When a player dies their selected death cry is activated.
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
