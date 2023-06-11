package io.github.neopixel.wrapper.games.bedwars;

import io.github.neopixel.wrapper.games.bedwars.practice.HypixelBedWarsPracticeAngle;
import io.github.neopixel.wrapper.games.bedwars.practice.HypixelBedWarsPracticeDistance;
import io.github.neopixel.wrapper.games.bedwars.practice.HypixelBedWarsPracticeElevation;
import io.github.neopixel.wrapper.games.bedwars.practice.HypixelBedWarsPracticeMode;
import io.github.neopixel.wrapper.games.bedwars.practice.HypixelBedWarsPracticeModeData;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelBedWarsPractice {

    private final JSONHandler jsonHandler;

    public HypixelBedWarsPractice(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    public int getBridgingRecord(HypixelBedWarsPracticeDistance distance,
        HypixelBedWarsPracticeElevation elevation, HypixelBedWarsPracticeAngle angle) {
        String recordLocation = String.format("bridging_distance_%s:elevation_%s:angle_%s:",
            distance.getDistance(), elevation.getElevation(), angle.getAngle());
        return jsonHandler.getJSONHandler("records").getSafeInt(recordLocation);
    }

    public int getModeData(HypixelBedWarsPracticeMode mode, HypixelBedWarsPracticeModeData data) {
        return jsonHandler.getJSONHandler(mode.getStatsPrefix()).getSafeInt(data.getStatsPrefix());
    }

}
