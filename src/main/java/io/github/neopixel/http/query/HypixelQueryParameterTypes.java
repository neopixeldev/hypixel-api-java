package io.github.neopixel.http.query;


public enum HypixelQueryParameterTypes {

    UUID("uuid"),
    NAME("name"),
    SKYBLOCK_PROFILE_ID("profile"),
    GUILD_BY_PLAYER("player"),
    GUILD_ID("id");

    private final String key;

    String getKey() {
        return key;
    }

    HypixelQueryParameterTypes(String key) {
        this.key = key;
    }
}
