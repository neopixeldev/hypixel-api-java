package io.github.hypixel_api_wrapper;

import io.github.hypixel_api_wrapper.wrapper.HypixelAPIDataRetrieval;
import java.io.IOException;
import java.util.UUID;

public class HypixelAPI {

    private final HypixelAPIDataRetrieval<?> dataRetriever;

    private HypixelAPI(UUID apiKey) {
        this.dataRetriever = new HypixelAPIDataRetrieval<>(apiKey);
    }

    public void shutdown() throws IOException {
        dataRetriever.close();
    }
}
