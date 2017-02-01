package com.aziel13.letsmod.block;


import com.aziel13.letsmod.creativeTab.CreativeTabLM;
import com.aziel13.letsmod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Will on 1/15/2017.
 */
public class BlockLM extends Block {

    public BlockLM () {

        this (Material.ROCK);


    }

    public BlockLM(Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);
    }

    public BlockLM(Material materialIn) {
        super(materialIn);
        this.setCreativeTab(CreativeTabLM.LM_TAB);
    }

    public static void registerBlock( Block block) {

        GameRegistry.register(block, new ResourceLocation(Reference.MOD_ID,block.getUnlocalizedName().substring(5)));
        GameRegistry.register(new ItemBlock(block),new ResourceLocation(Reference.MOD_ID,block.getUnlocalizedName().substring(5)));
    }

    public static void registerRender(Block block) {

        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
                new ModelResourceLocation(Reference.MOD_ID+":"+item.getUnlocalizedName().substring(5),
                        "inventory")
        );

    }


}
