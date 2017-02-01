package com.aziel13.letsmod.init;

import com.aziel13.letsmod.item.ItemLM;
import com.aziel13.letsmod.item.ItemMapleLeaf;
import com.aziel13.letsmod.reference.Reference;
import com.aziel13.letsmod.utility.LogHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Will on 1/13/2017.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemLM mapleLeaf = new ItemMapleLeaf();

    public static void preInit() {
        GameRegistry.register(mapleLeaf,new ResourceLocation(Reference.MOD_ID,"mapleleaf"));

    }

    public static void init() {

        mapleLeaf.registerRender();

    }
    /*
    public static void registerRender() {
        LogHelper.info("registerRender","registerRender");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(mapleLeaf,0,
                new ModelResourceLocation(Reference.MOD_ID +":"+ mapleLeaf.getUnlocalizedName().substring(5)
                        ,"inventory"));

    }*/


}
