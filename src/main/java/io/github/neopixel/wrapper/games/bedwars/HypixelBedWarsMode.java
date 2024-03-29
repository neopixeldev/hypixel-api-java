package io.github.neopixel.wrapper.games.bedwars;

/**
 * Past and present Bed Wars modes, including play-styles and team arrangements.
 */
public enum HypixelBedWarsMode {

    SOLOS("eight_one_"),
    DOUBLES("eight_two_"),
    TRIOS("four_three_"),
    FOURS("four_four_"),

    FOUR_VS_FOUR("two_four_"),

    RUSH_SOLOS("eight_one_rush_"),
    RUSH_DOUBLES("eight_two_rush_"),
    RUSH_FOURS("four_four_rush_"),

    ULTIMATE_DOUBLES("eight_two_ultimate_"),
    ULTIMATE_FOURS("four_four_ultimate_"),

    LUCKY_DOUBLES("eight_two_lucky_"),
    LUCKY_FOURS("four_four_lucky_"),

    ARMED_DOUBLES("eight_two_armed_"),
    ARMED_FOURS("four_four_armed_"),

    CASTLE("castle_"),

    VOIDLESS_DOUBLES("eight_two_voidless_"),
    VOIDLESS_FOURS("four_four_voidless_"),

    UNDERWORLD_DOUBLES("eight_two_underworld_"),
    UNDERWORLD_FOURS("four_four_underworld_"),

    SWAP_DOUBLES("eight_two_swap_"),
    SWAP_FOURS("four_four_swap_"),

    OVERALL("");

    String statsPrefix;

    HypixelBedWarsMode(String statsPrefix) {
        this.statsPrefix = statsPrefix;
    }

    public String getStatsPrefix() {
        return statsPrefix;
    }
}
