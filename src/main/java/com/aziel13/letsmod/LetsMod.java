package com.aziel13.letsmod;

import com.aziel13.letsmod.handler.ConfigurationHandler;
import com.aziel13.letsmod.init.ModBlocks;
import com.aziel13.letsmod.init.ModItems;
import com.aziel13.letsmod.proxy.IProxy;
import com.aziel13.letsmod.reference.Reference;
import com.aziel13.letsmod.utility.LogHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Aziel13 on 1/11/2017.
 */

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsMod {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.preInit();
        ModBlocks.preInit();

        LogHelper.info("Pre Initialization Complete","Pre Initialization Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        ModItems.init();
        ModBlocks.init();
        LogHelper.info("Initialization Complete","Initialization Complete");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post Initialization Complete","Post Initialization Complete");
    }


}
