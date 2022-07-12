package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsUltimateDoubles extends AbstractHypixelBedWars {

    public HypixelBedWarsUltimateDoubles(JSONObject stats) {
        super(stats);
    }

    @Override
    String prefix() {
        return "eight_two_ultimate_";
    }

    @Override
    public int getItemsPurchasedAmount() {
        return (int) stats.get(prefix() + "_items_purchased_bedwars");
    }


}
