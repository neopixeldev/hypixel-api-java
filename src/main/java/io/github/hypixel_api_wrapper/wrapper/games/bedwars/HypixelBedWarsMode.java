package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

public enum HypixelBedWarsMode {

    SOLOS("eight_one_"),
    DOUBLES("eight_two_"),
    TRIOS("four_three_"),
    FOURS("four_four_"),

    FOUR_VS_FOUR("two_four_"),

    RUSH_DOUBLES("eight_two_rush_"),
    RUSH_FOURS("four_four_rush_"),

    ULTIMATE_DOUBLES("eight_two_ultimate_"),
    ULTIMATE_FOURS("four_four_ultimate_"),

    LUCKY_DOUBLES("eight_two_lucky_"),
    LUCKY_FOURS("four_four_lucky_"),

    CASTLE("castle_"),

    VOIDLESS_FOURS("four_four_voidless_"),

    OVERALL("");

    String JSONKey;

    HypixelBedWarsMode(String JSONKey) {
        this.JSONKey = JSONKey;
    }

    public String getJSONKey() {
        return JSONKey;
    }
}
