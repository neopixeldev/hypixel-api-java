package io.github.neopixel.wrapper.skyblock;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.List;
import java.util.stream.Collectors;
import org.json.JSONObject;

public class SkyblockElection {

    private final RequestController requestController;
    private final JSONHandler jsonHandler;

    public SkyblockElection(RequestController requestController) {
        this.requestController = requestController;
        this.jsonHandler = requestController.getSkyblockElection().getJSONHandler("mayor");
    }

    /**
     * @return The type of the current mayor. (Ex. mining) // TODO: We should prob make an enum for these.
     */
    public String getKey() {
        return jsonHandler.getSafeString("key");
    }

    /**
     * @return The name of the mayor (Ex. Cole)
     */
    public String getName() {
        return jsonHandler.getSafeString("name");
    }

    /**
     * @return A list all the mayors active perks.
     * @see MayorPerk
     */
    public List<MayorPerk> getPerks() {
        return jsonHandler.getSafeJSONArray("perks").toList().stream().map(perksObject -> {
            JSONHandler perksJson = new JSONHandler((JSONObject) JSONObject.wrap(perksObject));
            return new MayorPerk(perksJson);
        }).collect(Collectors.toList());
    }

    public Election getElection() {
        return new Election(jsonHandler.getJSONHandler("election"));
    }

    public static class MayorPerk {

        private final JSONHandler jsonHandler;

        public MayorPerk(JSONHandler jsonHandler) {
            this.jsonHandler = jsonHandler;
        }

        /**
         * @return The name of the perk. (Ex. Mining XP Buff)
         */
        public String getName() {
            return jsonHandler.getSafeString("name");
        }

        /**
         * @return The description of the perk. (Ex. Get §3+60☯ Mining Wisdom §7on public islands.)
         */
        public String getDescription() {
            return jsonHandler.getSafeString("description");
        }
    }

    public static class Election {

        private final JSONHandler jsonHandler;

        public Election(JSONHandler jsonHandler) {
            this.jsonHandler = jsonHandler;
        }

        /**
         * @return The current hypixel skyblock year.
         */
        public Integer getYear() {
            return jsonHandler.getSafeInt("year");
        }

        /**
         * @return All the current candidates in the running.
         * @see ElectionCandidate
         */
        public List<ElectionCandidate> getCandidates() {
            return jsonHandler.getSafeJSONArray("candidates").toList().stream().map(candidatesObject -> {
                JSONHandler electionJson = new JSONHandler((JSONObject) JSONObject.wrap(candidatesObject));
                return new ElectionCandidate(electionJson);
            }).collect(Collectors.toList());
        }

        public static class ElectionCandidate {

            private final JSONHandler jsonHandler;

            public ElectionCandidate(JSONHandler jsonHandler) {
                this.jsonHandler = jsonHandler;
            }

            /**
             * @return The type of the mayor. (Ex. mining)
             */
            public String getKey() {
                return jsonHandler.getSafeString("key");
            }

            /**
             * @return The name of the mayor. (Ex. Cole)
             */
            public String getName() {
                return jsonHandler.getSafeString("name");
            }

            /**
             * @return A list all the mayors potential perks.
             * @see MayorPerk
             */
            public List<MayorPerk> getPerks() {
                return jsonHandler.getSafeJSONArray("perks").toList().stream().map(perksObject -> {
                    JSONHandler perksJson = new JSONHandler((JSONObject) JSONObject.wrap(perksObject));
                    return new MayorPerk(perksJson);
                }).collect(Collectors.toList());
            }

            /**
             * @return The amount of votes the mayor has received.
             */
            public Integer getVotes() {
                return jsonHandler.getSafeInt("votes");
            }
        }
    }
}
