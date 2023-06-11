package io.github.neopixel.wrapper.skyblock.player;

import io.github.neopixel.http.RequestController;
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

    public CommunityUpgrades getCommunityUpgrades() {
        return new CommunityUpgrades(jsonHandler.getJSONHandler("community_upgrades"));
    }

    public ProfileBank getBank() {
        return new ProfileBank(jsonHandler.getJSONHandler("banking"));
    }

    public static class ProfileBank {

        private final JSONHandler jsonHandler;

        public ProfileBank(JSONHandler jsonHandler) {
            this.jsonHandler = jsonHandler;
        }

        public Float getBalance() {
            return jsonHandler.getSafeFloat("balance");
        }
    }

    public static class CommunityUpgrades {

        private final JSONHandler jsonHandler;

        public CommunityUpgrades(JSONHandler jsonHandler) {
            this.jsonHandler = jsonHandler;
        }

        public CurrentUpgrade getCurrentUpgrade() {
            return new CurrentUpgrade(jsonHandler.getJSONHandler("currently_upgrading")); // null if not upgrading anything
        }

        public List<UpgradeState> getUpgradeStates() {
            return jsonHandler.getSafeJSONArray("upgrade_states").toList().stream().map(upgradeStates -> {
                JSONHandler statesJson = new JSONHandler((JSONObject) JSONObject.wrap(upgradeStates));
                return new UpgradeState(statesJson);
            }).collect(Collectors.toList());
        }

        public List<ProfileMember> getMembers() {
            List<ProfileMember> members = new ArrayList<>();

            Iterator<String> iterator = jsonHandler.getJSONHandler("members").getKeys();

            while (iterator.hasNext()) {
                members.add(
                    new ProfileMember(jsonHandler.getJSONHandler("members").getJSONHandler(iterator.next()))
                );
            }

            return members;
        }

        public static class CurrentUpgrade {

            private final JSONHandler jsonHandler;

            public CurrentUpgrade(JSONHandler jsonHandler) {
                this.jsonHandler = jsonHandler;
            }

            // Ex. coins_allowance
            public String getUpgrade() {
                return jsonHandler.getSafeString("upgrade");
            }

            public Integer getNewTier() {
                return jsonHandler.getSafeInt("new_tier");
            }

            public Long getStartedAt() {
                return jsonHandler.getSafeLong("start_ms");
            }

            // TODO: i think this is a string: f953226a544a4697bfd5a07d4e7165ad not a UUID
            public String getWhoStarted() {
                return jsonHandler.getSafeString("who_started");
            }
        }

        public static class UpgradeState {

            private final JSONHandler jsonHandler;

            public UpgradeState(JSONHandler jsonHandler) {
                this.jsonHandler = jsonHandler;
            }

            public String getUpgrade() {
                return jsonHandler.getSafeString("upgrade");
            }

            public Integer getTier() {
                return jsonHandler.getSafeInt("tier");
            }

            public Long getStartedAt() {
                return jsonHandler.getSafeLong("started_ms");
            }

            public String getWhoStarted() {
                return jsonHandler.getSafeString("started_by");
            }

            public Long getClaimedAt() {
                return jsonHandler.getSafeLong("claims_ms");
            }

            public String getWhoClaimed() {
                return jsonHandler.getSafeString("claimed_by");
            }

            public Boolean wasFastTracked() {
                return jsonHandler.getSafeBoolean("fasttracked");
            }
        }
    }

    public static class ProfileMember {

        private final JSONHandler jsonHandler;

        public ProfileMember(JSONHandler jsonHandler) {
            this.jsonHandler = jsonHandler;
        }

        public List<Pet> getPets() {
            return jsonHandler.getSafeJSONArray("pets").toList().stream().map(pets -> {
                JSONHandler petsJson = new JSONHandler((JSONObject) JSONObject.wrap(pets));
                return new Pet(petsJson);
            }).collect(Collectors.toList());
        }

        public static class Pet {

            private final JSONHandler jsonHandler;

            public Pet(JSONHandler jsonHandler) {
                this.jsonHandler = jsonHandler;
            }

            public UUID getUUID() {
                return jsonHandler.getSafeUUID("uuid");
            }

            // TODO: Pet enum
            public String getType() {
                return jsonHandler.getSafeString("type");
            }

            public Float getExp() {
                return jsonHandler.getSafeFloat("exp");
            }

            public Boolean isActive() {
                return jsonHandler.getSafeBoolean("active");
            }

            public String getTier() {
                // TODO: implement global enum for rarity skyblock
                return jsonHandler.getSafeString("tier");
            }

            public String getHeldItem() {
                return jsonHandler.getSafeString("heldItem");
            }

            public int getCandyUsed() {
                return jsonHandler.getSafeInt("candyUsed");
            }
        }

        public Integer getFairyExchanges() {
            return jsonHandler.getSafeInt("fairy_exchanges");
        }

        public Integer getSoulFlow() {
            return jsonHandler.getSafeInt("soulflow");
        }

        public Float getPurseCoins() {
            return jsonHandler.getSafeFloat("coin_purse");
        }

        public Float getRuneCraftingExp() {
            return jsonHandler.getSafeFloat("experience_skill_runecrafting");
        }

        public Float getMiningExp() {
            return jsonHandler.getSafeFloat("experience_skill_mining");
        }

        public Float getAlchemyExp() {
            return jsonHandler.getSafeFloat("experience_skill_alchemy");
        }

        public Float getTamingExp() {
            return jsonHandler.getSafeFloat("experience_skill_taming");
        }

        public Float getCombatExp() {
            return jsonHandler.getSafeFloat("experience_skill_combat");
        }

        public Float getFarmingExp() {
            return jsonHandler.getSafeFloat("experience_skill_farming");
        }

        public Float getSocialExp() {
            return jsonHandler.getSafeFloat("experience_skill_social2");
        }

        public Float getEnchantingExp() {
            return jsonHandler.getSafeFloat("experience_skill_enchanting");
        }

        public Float getFishingExp() {
            return jsonHandler.getSafeFloat("experience_skill_fishing");
        }

        public Float getForagingExp() {
            return jsonHandler.getSafeFloat("experience_skill_foraging");
        }

        public Float getCarpentryExp() {
            return jsonHandler.getSafeFloat("experience_skill_carpentry");
        }

        public Integer getUndeadEssence() {
            return jsonHandler.getSafeInt("essence_undead");
        }

        public Integer getDiamondEssence() {
            return jsonHandler.getSafeInt("essence_diamond");
        }

        public Integer getDragonExp() {
            return jsonHandler.getSafeInt("essence_dragon");
        }

        public Integer getGoldExp() {
            return jsonHandler.getSafeInt("essence_gold");
        }

        public Integer getIceEssence() {
            return jsonHandler.getSafeInt("essence_ice");
        }

        public Integer getWitherEssence() {
            return jsonHandler.getSafeInt("essence_wither");
        }

        public Integer getSpiderEssence() {
            return jsonHandler.getSafeInt("essence_spider");
        }
    }
}
