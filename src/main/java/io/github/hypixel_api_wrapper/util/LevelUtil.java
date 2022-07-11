package io.github.hypixel_api_wrapper.util;

public class LevelUtil {
    public static int getFullNetworkLevel(long exp) {
        return (int) Math.floor((Math.sqrt(exp * 2 + 30625) / 50) - 2.5);
    }

    /*
    @return an integer stating the amount of exp needed to reach the next Hypixel level.
     */
    public static int getNeededExp(long exp) {
        return 10000 + (2500 * (getFullNetworkLevel(exp) - 1));
    }

    /*
    @return an integer stating the amount of exp currently through a Hypixel level.
     */
    public static long getProgressExp(long exp) {
        return getTotalExpNeeded(getFullNetworkLevel(exp) + 1) - exp;
    }

    /*
    @return a long stating the total amount of exp needed to reach a Hypixel level, including all lower levels exp.
     */
    private static long getTotalExpNeeded(int targetLevel) {
        return (1250L * (targetLevel - 2) + 10000) * (targetLevel - 1);
    }




    public static int getEventLevel(long exp) {
        return (int) Math.floor(exp / 25000) + 1;
    }

    /*
    @return an integer stating the current amount of exp through a players level.
     */
    public static int getExpPastLastEventLevel(long exp) {
        return (int) exp % 25000;
    }

    public static int getExpUntilNextEventLevel(long exp) {
        return 25000 - getExpPastLastEventLevel(exp);
    }
}
