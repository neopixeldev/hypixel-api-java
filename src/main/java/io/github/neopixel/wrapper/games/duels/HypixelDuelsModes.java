package io.github.neopixel.wrapper.games.duels;

public enum HypixelDuelsModes {

    SKYWARS_SOLOS("sw_duel"),
    SKYWARS_DOUBLES("sw_doubles"),

    UHC_SOLOS("uhc_duel"),
    UHC_DOUBLES("uhc_doubles"),
    UHC_FOURS("uhc_four"),
    UHC_MEETUP("uhc_meetup"),

    SKYWARS_TOURNAMENT("sw_tournament"),
    UHC_TOURNAMENT("uhc_tournament"),
    SUMO_TOURNAMENT("sumo_tournament"),
    BRIDGE_TOURNAMENT("bridge_tournament"),

    CLASSIC_SOLOS("classic_duel"),

    OP_SOLOS("op_duel"),
    OP_DOUBLES("op_doubles"),

    POTION_SOLOS("potion_duel"),

    BLITZ_SOLOS("blitz_duel"),

    COMBO_SOLOS("combo_duel"),

    BOWSPLEEF_SOLOS("bowspleef_duel"),

    MEGAWALLS_SOLOS("mw_duel"),
    MEGAWALLS_DOUBLES("mw_doubles"),

    BOW_SOLOS("bow_duel"),

    SUMO("sumo_duel"),

    BRIDGE_SOLOS("bridge_duel"),
    BRIDGE_DOUBLES("bridge_doubles"),
    BRIDGE_FOURS("bridge_four"),

    BRIDGE_2v2v2v2("bridge_2v2v2v2"),
    BRIDGE_3v3v3v3("bridge_3v3v3v3");

    final String statsPrefix;

    HypixelDuelsModes(String statsPrefix) {
        this.statsPrefix = statsPrefix;
    }

    public String getStatsPrefix() {
        return statsPrefix;
    }
}
