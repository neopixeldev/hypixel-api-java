package io.github.neopixel.log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/*
    This class can be used by contributors to debug and test code.
    If, as an end user, you would like to use this class, just run the `setEnabled` method to true.
    As the class is static, no instance of this logger will need to be kept.
 */

public class HypixelAPILogger {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    // This HashMap contains a list of types the logger could display. By default, they're all true.
    private static final HashMap<LoggerFlag, Boolean> shownFlags = new HashMap<>();
    private static Boolean enabled = false;

    static {
        shownFlags.put(LoggerFlag.REQUEST, true);
        shownFlags.put(LoggerFlag.PARSE, true);
        shownFlags.put(LoggerFlag.OBJECT_CONSTRUCTION, true);
    }

    public static void log(String message, LoggerFlag type) {
        if (shownFlags.get(type) && enabled) {
            System.out.println(format(message, false));
        }
    }

    public static void error(String message, LoggerFlag type) {
        if (shownFlags.get(type) && enabled) {
            System.out.println(format(message, true));
        }
    }

    // This allows the end user to modify what messages should be shown.
    public static void setFlag(LoggerFlag flag, Boolean enabled) {
        shownFlags.put(flag, enabled);
    }

    public static void setEnabled(Boolean shouldBeEnabled) {
        enabled = shouldBeEnabled;
    }

    // This simply formats a message into the final form for printing. It adds time and either ERROR/INFO.
    private static String format(String message, boolean error) {
        return "[" + DATE_FORMAT.format(new Date()) + "] " + "[" + (error ? "INFO" : "ERROR") + "] "
            + message;
    }
}
