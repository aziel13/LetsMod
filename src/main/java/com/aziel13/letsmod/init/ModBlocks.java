package com.aziel13.letsmod.init;

import com.aziel13.letsmod.block.BlockFlag;
import com.aziel13.letsmod.block.BlockLM;
import com.aziel13.letsmod.reference.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Will on 1/16/2017.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockLM flag = new BlockFlag();

    public static void preInit() {
        BlockLM.registerBlock(flag);
    }

    public static void init() {
        BlockLM.registerRender(flag);
    }

}
