package com.aziel13.letsmod.client.gui;


import com.aziel13.letsmod.handler.ConfigurationHandler;
import com.aziel13.letsmod.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

/**
 * Created by Will on 1/12/2017.
 */
public class ModGuiConfig extends GuiConfig {

    public ModGuiConfig(GuiScreen guiScreen) {

        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString())


        );


    }

}
