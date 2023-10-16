package io.github.neopixel.wrapper.skyblock.player.upgrade;

import io.github.neopixel.wrapper.skyblock.player.member.ProfileMember;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import org.json.JSONObject;

public class ProfileCommunityUpgrades {

    private final JSONHandler jsonHandler;

    public ProfileCommunityUpgrades(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    public CurrentCommunityUpgrade getCurrentUpgrade() {
        return new CurrentCommunityUpgrade(
            jsonHandler.getJSONHandler("currently_upgrading")); // null if not upgrading anything
    }

    public List<CommunityUpgradeState> getUpgradeStates() {
        return jsonHandler.getSafeJSONArray("upgrade_states").toList().stream()
            .map(upgradeStates -> {
                JSONHandler statesJson = new JSONHandler(
                    (JSONObject) JSONObject.wrap(upgradeStates));
                return new CommunityUpgradeState(statesJson);
            }).collect(Collectors.toList());
    }

    public List<ProfileMember> getMembers() {
        List<ProfileMember> members = new ArrayList<>();

        Iterator<String> iterator = jsonHandler.getJSONHandler("members").getKeys();

        while (iterator.hasNext()) {
            members.add(
                new ProfileMember(
                    jsonHandler.getJSONHandler("members").getJSONHandler(iterator.next()))
            );
        }

        return members;
    }
}