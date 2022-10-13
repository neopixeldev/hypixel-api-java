package io.github.neopixel.wrapper.games.duels;

public enum HypixelDuelsModes {

    SKYWARS_SOLOS("sw_duel_"),
    SKYWARS_DOUBLES("sw_doubles_"),

    UHC_SOLOS("uhc_duel_"),
    UHC_DOUBLES("uhc_doubles_"),
    UHC_FOURS("uhc_four_"),
    UHC_MEETUP("uhc_meetup_"),

    SKYWARS_TOURNAMENT("sw_tournament"),
    UHC_TOURNAMENT("uhc_tournament_"),
    SUMO_TOURNAMENT("sumo_tournament_"),
    BRIDGE_TOURNAMENT("bridge_tournament"),

    CLASSIC_SOLOS("classic_duel_"),

    OP_SOLOS("op_duel_"),
    OP_DOUBLES("op_doubles_"),

    POTION_SOLOS("potion_duel_"),

    BLITZ_SOLOS("blitz_duel_"),

    COMBO_SOLOS("combo_duel_"),

    BOWSPLEEF_SOLOS("bowspleef_duel_"),

    MEGAWALLS_SOLOS("mw_duel_"),
    MEGAWALLS_DOUBLES("mw_doubles_"),

    BOW_SOLOS("bow_duel_"),

    SUMO("sumo_duel_"),

    BRIDGE_SOLOS("bridge_duel_"),
    BRIDGE_DOUBLES("bridge_doubles_"),
    BRIDGE_FOURS("bridge_four_"),

    BRIDGE_2v2v2v2("bridge_2v2v2v2"),
    BRIDGE_3v3v3v3("bridge_3v3v3v3"),










    final String statsPrefix;

    HypixelDuelsModes(String statsPrefix) {
        this.statsPrefix = statsPrefix;
    }

    public String getStatsPrefix() {
        return statsPrefix;
    }
}
