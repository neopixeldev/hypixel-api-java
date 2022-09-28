package io.github.neopixel.wrapper.games.build_battle;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.EnumSet;
import java.util.Map;
import java.util.Optional;

public class HypixelBuildBattle extends HypixelGame {

    protected HypixelBuildBattle(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "BUILD_BATTLE";
    }

    @Override
    public String getGameName() {
        return "Build Battle";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getSoloWins() {
        return jsonHandler.getSafeInt("wins_solo_normal");
    }

    public int getTeamWins() {
        return jsonHandler.getSafeInt("wins_teams_normal");
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins");
    }

    public int getCoins() {
        return jsonHandler.getSafeInt("coins");
    }

    public int getGuessTheBuildWins() {
        return jsonHandler.getSafeInt("wins_guess_the_build");
    }

    public int getGamesPlayed() {
        return jsonHandler.getSafeInt("games_played");
    }

    public int getScore() {
        return jsonHandler.getSafeInt("score");
    }

    public int getMonthlyCoinsA() {
        return jsonHandler.getSafeInt("monthly_coins_a");
    }

    public int getWeeklyCoinsB() {
        return jsonHandler.getSafeInt("weekly_coins_b");
    }

    public int getCorrectGuesses() {
        return jsonHandler.getSafeInt("correct_guesses");
    }

    public int getSoloMostPoints() {
        return jsonHandler.getSafeInt("solo_most_points");
    }

    public int getWeeklyCoinsA() {
        return jsonHandler.getSafeInt("weekly_coins_a");
    }

    public int getTotalVotes() {
        return jsonHandler.getSafeInt("total_votes");
    }

    public int getSuperVotes() {
        return jsonHandler.getSafeInt("super_votes");
    }

    public Map<String, Integer> getLoadout() {
        throw new UnsupportedOperationException();
    }

    public EnumSet<HypixelBuildBattlePackages> getPackages() {
        throw new UnsupportedOperationException();
    }

    public HypixelBuildBattlePackages getSelectedHat() {
        return HypixelBuildBattlePackages.valueOf(jsonHandler.getSafeString("new_selected_hat").toUpperCase());
    }

    public int getMonthlyCoinsB() {
        return jsonHandler.getSafeInt("monthly_coins_b");
    }
}
