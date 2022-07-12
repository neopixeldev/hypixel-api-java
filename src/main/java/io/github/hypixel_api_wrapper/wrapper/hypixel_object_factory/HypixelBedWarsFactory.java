package io.github.hypixel_api_wrapper.wrapper.hypixel_object_factory;

import io.github.hypixel_api_wrapper.http.RequestFactory;
import io.github.hypixel_api_wrapper.util.Endpoint;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.AbstractHypixelBedWars;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWars;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWars4v4;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWarsCastle;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWarsCoreModes;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWarsDoubles;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWarsFours;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWarsLuckyDoubles;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWarsRushDoubles;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWarsRushFours;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWarsSolos;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWarsUltimateDoubles;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWarsUltimateFours;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWarsVoidlessFours;
import java.util.Optional;
import org.json.JSONObject;

public class HypixelBedWarsFactory extends HypixelObjectFactory {

    AbstractHypixelBedWars solos;
    AbstractHypixelBedWars doubles;
    AbstractHypixelBedWars trios;
    AbstractHypixelBedWars squads;
    AbstractHypixelBedWars coreModes;
    AbstractHypixelBedWars fourVSfour;
    AbstractHypixelBedWars rushDoubles;
    AbstractHypixelBedWars rushFours;
    AbstractHypixelBedWars ultimateDoubles;
    AbstractHypixelBedWars ultimateFours;
    AbstractHypixelBedWars luckyDoubles;
    AbstractHypixelBedWars castle;
    AbstractHypixelBedWars voidlessFours;
    HypixelBedWars overall;

    public HypixelBedWarsFactory(JSONObject stats) {
        super(stats);
    }

    public AbstractHypixelBedWars getSoloStats() {
        return Optional.ofNullable(solos).orElse(solos = new HypixelBedWarsSolos(stats));
    }

    public AbstractHypixelBedWars getDoubleStats() {
        return Optional.ofNullable(doubles).orElse(doubles = new HypixelBedWarsDoubles(stats));
    }

    public AbstractHypixelBedWars getTrioStats() {
        return Optional.ofNullable(trios).orElse(trios = new HypixelBedWarsSolos(stats));
    }

    public AbstractHypixelBedWars getFoursStats() {
        return Optional.ofNullable(squads).orElse(squads = new HypixelBedWarsFours(stats));
    }

    public AbstractHypixelBedWars getCoreModesStats() {
        return Optional.ofNullable(coreModes).orElse(coreModes = new HypixelBedWarsCoreModes(stats));
    }
    public AbstractHypixelBedWars getFourVSFourStats() {
        return Optional.ofNullable(fourVSfour).orElse(fourVSfour = new HypixelBedWars4v4(stats));
    }

    public AbstractHypixelBedWars getRushDoublesStats() {
        return Optional.ofNullable(rushDoubles).orElse(rushDoubles = new HypixelBedWarsRushDoubles(stats));
    }

    public AbstractHypixelBedWars getRushFoursStats() {
        return Optional.ofNullable(rushFours).orElse(rushFours = new HypixelBedWarsRushFours(stats));
    }

    public AbstractHypixelBedWars getUltimateDoublesStats() {
        return Optional.ofNullable(ultimateDoubles).orElse(ultimateDoubles = new HypixelBedWarsUltimateDoubles(stats));
    }

    public AbstractHypixelBedWars getUltimateFoursStats() {
        return Optional.ofNullable(ultimateFours).orElse(ultimateFours = new HypixelBedWarsUltimateFours(stats));
    }

    public AbstractHypixelBedWars getLuckyDoublesStats() {
        return Optional.ofNullable(luckyDoubles).orElse(luckyDoubles = new HypixelBedWarsLuckyDoubles(stats));
    }

    public AbstractHypixelBedWars getCastleStats() {
        return Optional.ofNullable(castle).orElse(castle = new HypixelBedWarsCastle(stats));
    }

    public AbstractHypixelBedWars getVoidlessFoursStats() {
        return Optional.ofNullable(voidlessFours).orElse(voidlessFours = new HypixelBedWarsVoidlessFours(stats));
    }

    public HypixelBedWars getOverallStats() {
        return Optional.ofNullable(overall).orElse(overall = new HypixelBedWars(stats));
    }
}
