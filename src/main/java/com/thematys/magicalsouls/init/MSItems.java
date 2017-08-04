package com.thematys.magicalsouls.init;

import com.thematys.magicalsouls.item.base.MSItem;
import com.thematys.magicalsouls.reference.MSReferences;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MSItems
{
    //Mod items
    public static MSItem soulGuide;

    //Item initializations
    public static void initItems()
    {
        soulGuide = new MSItem("soul_guide");
    }

    //Item registrations
    public static void registerItems()
    {
        registerItem(soulGuide);
    }

    private static void registerItem(MSItem item)
    {
        GameRegistry.register(item, new ResourceLocation(MSReferences.MOD_IDENTIFIER_LC, item.getName()));
    }

    public static void registerItemModels()
    {
        registerItemModel(soulGuide);
    }

    private static void registerItemModel(MSItem item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(MSReferences.MOD_IDENTIFIER_LC + ":" + item.getName(), "inventory"));
    }
}
