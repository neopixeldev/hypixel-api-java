package io.github.neopixel.wrapper.games.bedwars;

import io.github.neopixel.wrapper.HypixelLootChestGame;
import io.github.neopixel.wrapper.games.HypixelCosmetic;
import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.games.bedwars.cosmetics.BedwarsDeathCries;
import io.github.neopixel.wrapper.games.bedwars.cosmetics.BedwarsIslandToppers;
import io.github.neopixel.wrapper.games.bedwars.cosmetics.BedwarsSprays;
import io.github.neopixel.wrapper.games.bedwars.cosmetics.BedwarsVictoryDances;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.Optional;

/**
 * A player's overall stats for the game Bed Wars.
 * <p>
 * To get their stats for a particular {@link HypixelBedWarsMode mode}, use
 * {@link #getMode(HypixelBedWarsMode) getMode}.
 */
public class HypixelBedWarsStats extends HypixelGame implements HypixelLootChestGame {

    public HypixelBedWarsStats(JSONHandler jsonHandler) {
        super(jsonHandler);
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
        return new HypixelBedWars(
            jsonHandler.getThisJSONHandlerWithStatsPrefix(mode.getStatsPrefix()));
    }

    public HypixelBedWarsPractice getPractice() {
        return new HypixelBedWarsPractice(
            jsonHandler.getJSONHandler("Bedwars").getJSONHandler("practice"));
    }

    /**
     * Coins are earned by winning, killing other players, breaking beds, and completing quests.
     * They can be used to purchase Bed Wars cosmetics, such as shopkeeper skins and victory
     * dances.
     *
     * @return The total number of Bed Wars coins the player currently has.
     */
    public final int getCoins() {
        return jsonHandler.getSafeInt("coins");
    }

    /**
     * Players increase their Bed Wars level by gaining {@link #getExperience() experience}. The
     * higher the level, the more experience is required to move to the next level. Every 100
     * levels, a player advances to the next prestige.
     *
     * @return The player's current Bed Wars level.
     */
    public final int getLevel() {
        return jsonHandler.getSafeInt("level");
    }

    /**
     * Experience is accumulated while playing Bed Wars, especially by winning games, breaking beds,
     * and completing quests. The more experience a player earns, the more they
     * {@link #getLevel() level up}.
     *
     * @return The player's total Bed Wars experience.
     */
    public final int getExperience() {
        return jsonHandler.getSafeInt("Experience");
    }

    /**
     * The effect played when the player wins a game. Victory dances are bought with
     * {@link #getCoins() coins} from the Bed Wars shop, or found randomly in
     * {@link #getOpenedChestsAmount() loot boxes}.
     *
     * @return The ID of the effect played when the player wins.
     */
    public final HypixelCosmetic getActiveVictoryDance() {
        return HypixelCosmetic.getHypixelCosmeticFromKey(BedwarsVictoryDances.class, jsonHandler.getSafeString("activeVictoryDance"));
    }

    /**
     * A little structure that appears on top of the player's island. Island toppers are bought with
     * {@link #getCoins() coins} from the Bed Wars shop, or found randomly in
     * {@link #getOpenedChestsAmount() loot boxes}.
     *
     * @return The ID of the player's selected island topper.
     */
    public final HypixelCosmetic getActiveIslandTopper() {
        return HypixelCosmetic.getHypixelCosmeticFromKey(BedwarsIslandToppers.class, jsonHandler.getSafeString("activeIslandTopper"));
    }

    /**
     * An image that the player can place in various spots around Bed Wars maps. Sprays are bought
     * with {@link #getCoins() coins} from the Bed Wars shop, or found randomly in
     * {@link #getOpenedChestsAmount() loot boxes}.
     *
     * @return The ID of the player's selected spray.
     */
    public final HypixelCosmetic getActiveSpray() {
        return HypixelCosmetic.getHypixelCosmeticFromKey(BedwarsSprays.class, jsonHandler.getSafeString("activeSprays"));
    }

    /**
     * An effect played when the player is killed. Death cries are bought with
     * {@link #getCoins() coins} from the Bed Wars shop, or found randomly in
     * {@link #getOpenedChestsAmount() loot boxes}.
     *
     * @return The ID of the effect played when the player dies.
     */
    public final HypixelCosmetic getActiveDeathCry() {
        return HypixelCosmetic.getHypixelCosmeticFromKey(BedwarsDeathCries.class, jsonHandler.getSafeString("activeDeathCry"));
    }

    @Override
    public int getOpenedChestsAmount() {
        return jsonHandler.getSafeInt("Bedwars_openedChests");
    }

    @Override
    public int getOpenedCommonChestsAmount() {
        return jsonHandler.getSafeInt("Bedwars_openedCommons");
    }

    @Override
    public int getOpenedRareChestsAmount() {
        return jsonHandler.getSafeInt("Bedwars_openedRares");
    }

    @Override
    public int getOpenedEpicChestsAmount() {
        return jsonHandler.getSafeInt("Bedwars_openedEpics");
    }

    @Override
    public int getOpenedLegendaryChestsAmount() {
        return jsonHandler.getSafeInt("Bedwars_openedLegendaries");
    }
}
