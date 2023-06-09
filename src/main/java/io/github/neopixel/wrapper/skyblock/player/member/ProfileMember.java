package io.github.neopixel.wrapper.skyblock.player.member;

import io.github.neopixel.wrapper.skyblock.player.pet.SkyblockPet;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.List;
import java.util.stream.Collectors;
import org.json.JSONObject;

public class ProfileMember {

    private final JSONHandler jsonHandler;

    public ProfileMember(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    public List<SkyblockPet> getPets() {
        return jsonHandler.getSafeJSONArray("pets").toList().stream().map(pets -> {
            JSONHandler petsJson = new JSONHandler((JSONObject) JSONObject.wrap(pets));
            return new SkyblockPet(petsJson);
        }).collect(Collectors.toList());
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