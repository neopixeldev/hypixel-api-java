package io.github.hypixel_api_wrapper.wrapper.hypixel_object_factory;

import io.github.hypixel_api_wrapper.http.RequestFactory;

public abstract class HypixelObjectFactory {

    RequestFactory requestFactory;

    public HypixelObjectFactory(RequestFactory requestFactory) {
        this.requestFactory = requestFactory;
    }
}
