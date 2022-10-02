package io.github.neopixel.http.query;


public enum HypixelQueryParameterTypes {

    UUID("uuid"),
    NAME("name"),
    GUILD_ID("id");

    private String key;

    String getKey() {
        return key;
    }

    HypixelQueryParameterTypes(String key) {
        this.key = key;
    }
}
