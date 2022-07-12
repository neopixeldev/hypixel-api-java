package io.github.hypixel_api_wrapper.wrapper.hypixel_object_factory;

import org.json.JSONObject;

public abstract class HypixelObjectFactory {

    JSONObject stats;

    public HypixelObjectFactory(JSONObject stats) {
        this.stats = stats;
    }
}
