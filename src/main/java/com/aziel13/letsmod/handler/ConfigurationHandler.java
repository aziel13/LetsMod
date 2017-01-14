package com.aziel13.letsmod.handler;

import com.aziel13.letsmod.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

/**
 * Created by Will on 1/12/2017.
 */
public class ConfigurationHandler {

    public static Configuration configuration;

    public static boolean testValue;
    public static void init(File configFile) {

       if (configuration == null) {

           configuration = new Configuration(configFile);
           loadConfiguration();
       }


    }


    public static void loadConfiguration() {

        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL,false,"This is an example configuration value");
        System.out.println("loadConfiguration for (Reference.MOD_ID: " + Reference.MOD_ID);

        if (configuration.hasChanged()) {

            configuration.save();

        }

    }

    @SubscribeEvent
    public void onConfigurationChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event){

        System.out.println("(Reference.MOD_ID: " + Reference.MOD_ID);
        System.out.println("(event.getModID(): " + event.getModID());
        System.out.println("(event.getModID().equalsIgnoreCase(Reference.MOD_ID): " + event.getModID().equalsIgnoreCase(Reference.MOD_ID));

        if(event.getModID().equalsIgnoreCase(Reference.MOD_ID)) {
            loadConfiguration();
        }

    }


}
