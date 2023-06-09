package io.github.neopixel.wrapper.skyblock.player;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.skyblock.player.bank.ProfileBank;
import io.github.neopixel.wrapper.skyblock.player.member.ProfileMember;
import io.github.neopixel.wrapper.skyblock.player.upgrade.CommunityUpgradeState;
import io.github.neopixel.wrapper.skyblock.player.upgrade.CurrentCommunityUpgrade;
import io.github.neopixel.wrapper.skyblock.player.upgrade.ProfileCommunityUpgrades;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.json.JSONObject;

public class SkyblockProfile {

    private final JSONHandler jsonHandler;

    public SkyblockProfile(RequestController requestController, String profileId) {
        this.jsonHandler = requestController.getSkyblockProfile(profileId).getJSONHandler("profile");
    }

    /**
     * @return The ID of the profile.
     */
    public String getProfileID() {
        return jsonHandler.getSafeString("profile_id");
    }

    /**
     * @return The name of the profile. (Ex. Lemon)
     */
    public String getCuteName() {
        return jsonHandler.getSafeString("cute_name");
    }

    /**
     * @return True if the profile is currently selected.
     */
    public Boolean isSelected() {
        return jsonHandler.getSafeBoolean("selected");
    }

    /**
     * @return The timestamp the profile was last saved to hypixel's database.
     */
    public Long getLastSave() {
        return jsonHandler.getSafeLong("last_save");
    }

    public ProfileCommunityUpgrades getCommunityUpgrades() {
        return new ProfileCommunityUpgrades(jsonHandler.getJSONHandler("community_upgrades"));
    }

    public ProfileBank getBank() {
        return new ProfileBank(jsonHandler.getJSONHandler("banking"));
    }
}
