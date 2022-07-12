package io.github.hypixel_api_wrapper.wrapper.hypixel_object_factory;

import io.github.hypixel_api_wrapper.http.RequestFactory;
import io.github.hypixel_api_wrapper.util.Endpoint;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWars;

public class HypixelBedWarsFactory extends HypixelObjectFactory {

    public HypixelBedWarsFactory(RequestFactory requestFactory) {
        super(requestFactory);
    }

    public HypixelBedWars getBedWarsStats() {
        return new HypixelBedWars(requestFactory.send(Endpoint.PLAYER.getURL().toString()));
    }
}
