package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

/**
 * Different types of kills / deaths that are tracked in BedWars.
 */
public enum BedWarsKillCause {

    PROJECTILE("projectile_"),
    FALL("fall_"),
    VOID("void_"),
    ENTITY("entity_attack_"),
    OVERALL("");

    String key;
     BedWarsKillCause(String key) {
        this.key = key;
    }

    public String getKey() {
         return key;
    }
}
