package com.aziel13.letsmod;

import com.aziel13.letsmod.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Aziel13 on 1/11/2017.
 */

@Mod(modid="LetsMod", name="LetsMod", version="1.10.2-1.0")
public class LetsMod {

    @Mod.Instance("LetsMod")
    public static LetsMod instance;

    @SidedProxy(clientSide = "com.aziel13.letsmod.proxy.clientProxy", serverSide = "com.aziel13.letsmod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preInit){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent init) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postInit) {

    }


}
