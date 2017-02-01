package com.aziel13.letsmod.utility;

import com.aziel13.letsmod.reference.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Will on 1/13/2017.
 */
public class ResourceLocationHelper {

    private ResourceLocationHelper() {}

    public static ResourceLocation getResourceLocation(String path) {
        return new ResourceLocation(Reference.MOD_ID, path);
    }

    public static ModelResourceLocation getModelResourceLocation(String path) {
        return new ModelResourceLocation(Reference.MOD_ID + ":" + path);
    }

}
