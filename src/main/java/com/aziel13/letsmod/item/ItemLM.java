package com.aziel13.letsmod.item;

import com.aziel13.letsmod.creativeTab.CreativeTabLM;
import com.aziel13.letsmod.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
//import net.minecraft.client.renderer.texture.


/**
 * Created by Will on 1/13/2017.
 */
public class ItemLM extends Item {

    public ItemLM() {

        super();
        this.setCreativeTab(CreativeTabLM.LM_TAB);

    }
/*
    @Override
    public String getUnlocalizedName() {

        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
*/
    /*
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }*/

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


/*    public static void registerRenders() {
        registerRender(this);
    }*/

    public void registerRender() {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 0,
                new ModelResourceLocation(Reference.MOD_ID+":"+super.getUnlocalizedName().substring(5),
                        "inventory")
        );
    }
}
