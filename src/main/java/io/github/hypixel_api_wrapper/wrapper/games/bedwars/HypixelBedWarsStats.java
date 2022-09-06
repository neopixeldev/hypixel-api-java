package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import io.github.hypixel_api_wrapper.wrapper.HypixelLootChestGame;
import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.cosmetics.BedwarsDeathCries;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.cosmetics.BedwarsIslandToppers;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.cosmetics.BedwarsSprays;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.cosmetics.BedwarsVictoryDances;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
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
            new JSONHandler(jsonHandler.getStatsObject(), mode.getStatsPrefix()));
    }

    /**
     * Coins are earned by winning, killing other players, breaking beds, and completing quests.
     * They can be used to purchase Bed Wars cosmetics, such as shopkeeper skins and victory
     * dances.
     *
     * @return The total number of Bed Wars coins the player currently has.
     */
    public final Optional<Integer> getCoins() {
        return jsonHandler.getSafeInt("coins");
    }

    /**
     * Players increase their Bed Wars level by gaining {@link #getExperience() experience}. The
     * higher the level, the more experience is required to move to the next level. Every 100
     * levels, a player advances to the next prestige.
     *
     * @return The player's current Bed Wars level.
     */
    public final Optional<Integer> getLevel() {
        return jsonHandler.getSafeInt("level");
    }

    /**
     * Experience is accumulated while playing Bed Wars, especially by winning games, breaking beds,
     * and completing quests. The more experience a player earns, the more they
     * {@link #getLevel() level up}.
     *
     * @return The player's total Bed Wars experience.
     */
    public final Optional<Integer> getExperience() {
        return jsonHandler.getSafeInt("Experience");
    }

    /**
     * The effect played when the player wins a game. Victory dances are bought with
     * {@link #getCoins() coins} from the Bed Wars shop, or found randomly in
     * {@link #getOpenedChestsAmount() loot boxes}.
     *
     * @return The ID of the effect played when the player wins.
     */
    public final Optional<BedwarsVictoryDances> getActiveVictoryDance() {
        return Optional.of(
            BedwarsVictoryDances.valueOf(jsonHandler.getSafeString("activeVictoryDance").get()));
    }

    /**
     * A little structure that appears on top of the player's island. Island toppers are bought with
     * {@link #getCoins() coins} from the Bed Wars shop, or found randomly in
     * {@link #getOpenedChestsAmount() loot boxes}.
     *
     * @return The ID of the player's selected island topper.
     */
    public final Optional<BedwarsIslandToppers> getActiveIslandTopper() {
        return Optional.of(
            BedwarsIslandToppers.valueOf(jsonHandler.getSafeString("activeIslandTopper").get()));
    }

    /**
     * An image that the player can place in various spots around Bed Wars maps. Sprays are bought
     * with {@link #getCoins() coins} from the Bed Wars shop, or found randomly in
     * {@link #getOpenedChestsAmount() loot boxes}.
     *
     * @return The ID of the player's selected spray.
     */
    public final Optional<BedwarsSprays> getActiveSpray() {
        return Optional.of(
            BedwarsSprays.valueOf(jsonHandler.getSafeString("activeSprays").get()));
    }

    /**
     * An effect played when the player is killed. Death cries are bought with
     * {@link #getCoins() coins} from the Bed Wars shop, or found randomly in
     * {@link #getOpenedChestsAmount() loot boxes}.
     *
     * @return The ID of the effect played when the player dies.
     */
    public final Optional<BedwarsDeathCries> getActiveDeathCry() {
        return Optional.of(
            BedwarsDeathCries.valueOf(jsonHandler.getSafeString("activeDeathCry").get()));
    }

    @Override
    public Optional<Integer> getOpenedChestsAmount() {
        return jsonHandler.getSafeInt("Bedwars_openedChests");
    }

    @Override
    public Optional<Integer> getOpenedCommonChestsAmount() {
        return jsonHandler.getSafeInt("Bedwars_openedCommons");
    }

    @Override
    public Optional<Integer> getOpenedRareChestsAmount() {
        return jsonHandler.getSafeInt("Bedwars_openedRares");
    }

    @Override
    public Optional<Integer> getOpenedEpicChestsAmount() {
        return jsonHandler.getSafeInt("Bedwars_openedEpics");
    }

    @Override
    public Optional<Integer> getOpenedLegendaryChestsAmount() {
        return jsonHandler.getSafeInt("Bedwars_openedLegendaries");
    }
}
