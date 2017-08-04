package com.thematys.magicalsouls.util;

import com.thematys.magicalsouls.reference.MSReferences;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class MSLog
{
    /* The abstract log method. Each of the methods with specified log levels call this to log their data. */
    private static void log(Level level, Object object)
    {
        FMLLog.log(MSReferences.MOD_IDENTIFIER, level, String.valueOf(object));
    }

    /* The method, without a log level. The log level is set to 'info', but Magical Souls does not display the level on the logging screen. */
    public static void logNoLevel(Object object)
    {
        log(Level.INFO, object);
    }

    /* Logging method for log level 'debug' */
    public static void logDebug(Object object)
    {
        log(Level.DEBUG, "[DEBUG]: " + object);
    }

    /* Logging method for log level 'error' */
    public static void logError(Object object)
    {
        log(Level.ERROR, "[ERROR]: " + object);
    }

    /* Logging method for log level 'fatal' */
    public static void logFatal(Object object)
    {
        log(Level.FATAL, "[FATAL ERROR]: " + object);
    }

    /* Logging method for log level 'info' */
    public static void logInfo(Object object)
    {
        log(Level.INFO, object);
    }

    /* Logging method for log level 'off' */
    public static void logOff(Object object)
    {
        log(Level.OFF, "[OFF]: " + object);
    }

    /* Logging method for log level 'trace' */
    public static void logTrace(Object object)
    {
        log(Level.TRACE, "[TRACE]: " + object);
    }

    /* Logging method for log level 'warn' */
    public static void logWarning(Object object)
    {
        log(Level.WARN, "[WARNING]: " + object);
    }
}
