package com.aziel13.letsmod.utility;

import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

/**
 * Created by Will on 1/13/2017.
 */
public class LogHelper {

    public static void log(Level logLevel,String formattedMessage, Object object) {
        FMLLog.log(logLevel,formattedMessage,object);
    }

    public static void all(Object object,String message)
    {
        log(Level.ALL, message, object);
    }

    public static void debug(Object object,String message)
    {
        log(Level.DEBUG, message, object);
    }

    public static void error(Object object,String message)
    {
        log(Level.ERROR, message, object);
    }

    public static void fatal(Object object,String message)
    {
        log(Level.FATAL, message, object);
    }

    public static void info(Object object,String message)
    {
        log(Level.INFO, message, object);
    }

    public static void off(Object object,String message)
    {
        log(Level.OFF, message, object);
    }

    public static void trace(Object object,String message)
    {
        log(Level.TRACE, message, object);
    }

    public static void warn(Object object,String message)
    {
        log(Level.WARN, message, object);
    }
}
