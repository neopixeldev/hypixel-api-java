package io.github.neopixel.wrapper.games.duels;

import io.github.neopixel.wrapper.HypixelLootChestGame;
import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.games.bedwars.HypixelBedWars;
import io.github.neopixel.wrapper.games.bedwars.HypixelBedWarsMode;
import io.github.neopixel.wrapper.util.JSONHandler;

/**
 * A player's overall stats for the duels.
 * <p>
 * To get their stats for a particular {@link HypixelDuelsModes mode}, use the
 * {@link #getMode(HypixelDuelsModes) getMode()} method.
 */
public class HypixelDuelsStats extends HypixelGame implements HypixelLootChestGame {

    protected HypixelDuelsStats(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "DUELS";
    }

    @Override
    public String getGameName() {
        return "Duels";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    /**
     * Gets the player's stats for a particular Duels mode.
     *
     * @param mode The mode to get the player's stats for.
     * @return The player's stats for that mode.
     */
    public HypixelDuels getMode(HypixelDuelsModes mode) {
        return new HypixelDuels(
            jsonHandler.getThisJSONHandlerWithStatsPrefix(mode.getStatsPrefix()));
    }

    public boolean isKitMenuOptionEnabled() {
        return jsonHandler.getSafeString("kit_menu_option").equals("on");
    }

    public boolean isShowLeaderboardsEnabled() {
        return jsonHandler.getSafeString("show_lb_option").equals("on");
    }

    public int getGamesPlayed() {
        return jsonHandler.getSafeInt("games_played_duels");
    }

    public String getRematchOption() {
        return jsonHandler.getSafeString("rematch_option_1");
    }

    public int getCoins() {
        return jsonHandler.getSafeInt("coins");
    }

    public String getActiveProjectileTrail() {
        return jsonHandler.getSafeString("active_projectile_trail");
    }

    public String getActiveEmblem() {
        return jsonHandler.getSafeString("active_emblem");
    }

    public String getActiveKillMessage() {
        return jsonHandler.getSafeString("active_killmessages");
    }

    public String getActiveKillEffect() {
        return jsonHandler.getSafeString("active_kill_effect");
    }

    public String getActiveVictoryDance() {
        return jsonHandler.getSafeString("active_victory_dance");
    }

    public String getActiveAuras() {
        return jsonHandler.getSafeString("active_auras");
    }

    public String getActiveWeaponpacks() {
        return jsonHandler.getSafeString("active_weaponpacks");
    }

    public boolean isChallengesEnabled() {
        return jsonHandler.getSafeBoolean("challenges_enabled");
    }

    public String getStatusField() {
        return jsonHandler.getSafeString("status_field");
    }

    public String getEquippedCustomTitle() {
        return jsonHandler.getSafeString("equipped_custom_titles");
    }

    public boolean isProjectileTrailEnabled() {
        return jsonHandler.getSafeBoolean("toggle_proj_trail");
    }

    public String getActiveCosmeticTitle() {
        return jsonHandler.getSafeString("active_cosmetictitle");
    }







    @Override
    public int getOpenedChestsAmount() {
        return jsonHandler.getSafeInt("Duels_openedChests");
    }

    @Override
    public int getOpenedCommonChestsAmount() {
        return jsonHandler.getSafeInt("Duels_openedCommons");
    }

    @Override
    public int getOpenedRareChestsAmount() {
        return jsonHandler.getSafeInt("Duels_openedRares")
    }

    @Override
    public int getOpenedEpicChestsAmount() {
        return jsonHandler.getSafeInt("Duels_openedEpics")
    }

    @Override
    public int getOpenedLegendaryChestsAmount() {
        return jsonHandler.getSafeInt("Duels_openedLegendaries")
    }
}
