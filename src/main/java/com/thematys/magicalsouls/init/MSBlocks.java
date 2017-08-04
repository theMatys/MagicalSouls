package com.thematys.magicalsouls.init;

import com.thematys.magicalsouls.block.MSBlockSoulAltar;
import com.thematys.magicalsouls.block.base.MSBlock;
import com.thematys.magicalsouls.reference.MSReferences;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MSBlocks
{
    //Mod items
    public static MSBlock soulAltar;

    //Item initializations
    public static void initBlocks()
    {
        soulAltar = new MSBlockSoulAltar("soul_altar");
    }

    //Item registrations
    public static void registerBlocks()
    {
        registerBlock(soulAltar);
    }

    private static void registerBlock(MSBlock block)
    {
        GameRegistry.register(block, new ResourceLocation(MSReferences.MOD_IDENTIFIER_LC, block.getName()));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(MSReferences.MOD_IDENTIFIER_LC, block.getName()));
    }

    public static void registerBlockModels()
    {
        registerBlockModel(soulAltar);
    }

    private static void registerBlockModel(MSBlock block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(MSReferences.MOD_IDENTIFIER_LC + ":" + block.getName(), "inventory"));
    }
}
