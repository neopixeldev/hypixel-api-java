package io.github.neopixel.wrapper.games.bedwars;

/**
 * Past and present Bed Wars modes, including play-styles and team arrangements.
 */
public enum HypixelBedWarsMode {

    SOLOS("eight_one"),
    DOUBLES("eight_two"),
    TRIOS("four_three"),
    FOURS("four_four"),

    FOUR_VS_FOUR("two_four"),

    RUSH_SOLOS("eight_one_rush"),
    RUSH_DOUBLES("eight_two_rush"),
    RUSH_FOURS("four_four_rush"),

    ULTIMATE_DOUBLES("eight_two_ultimate"),
    ULTIMATE_FOURS("four_four_ultimate"),

    LUCKY_DOUBLES("eight_two_lucky"),
    LUCKY_FOURS("four_four_lucky"),

    ARMED_DOUBLES("eight_two_armed"),
    ARMED_FOURS("four_four_armed"),

    CASTLE("castle"),

    VOIDLESS_DOUBLES("eight_two_voidless"),
    VOIDLESS_FOURS("four_four_voidless"),

    UNDERWORLD_DOUBLES("eight_two_underworld"),
    UNDERWORLD_FOURS("four_four_underworld"),

    SWAP_DOUBLES("eight_two_swap"),
    SWAP_FOURS("four_four_swap"),

    OVERALL("");

    final String statsPrefix;

    HypixelBedWarsMode(String statsPrefix) {
        this.statsPrefix = statsPrefix;
    }

    public String getStatsPrefix() {
        return statsPrefix;
    }
}
