package com.aziel13.letsmod.creativeTab;

import com.aziel13.letsmod.init.ModItems;
import com.aziel13.letsmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Will on 1/13/2017.
 */
public class CreativeTabLM {

    public static final CreativeTabs LM_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }
    };

}
