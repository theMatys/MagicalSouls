package com.thematys.magicalsouls;

import com.thematys.magicalsouls.init.MSBlocks;
import com.thematys.magicalsouls.init.MSItems;
import com.thematys.magicalsouls.proxy.MSCommonProxy;
import com.thematys.magicalsouls.reference.MSReferences;

import com.thematys.magicalsouls.util.MSCreativeTab;
import com.thematys.magicalsouls.util.MSLog;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = MSReferences.MOD_IDENTIFIER_LC, name = MSReferences.MOD_NAME, version = MSReferences.MOD_VERSION, acceptedMinecraftVersions = MSReferences.MOD_ACCEPTED_MINECRAFT_VERSION)
public class MagicalSouls
{
    @Mod.Instance
    public static MagicalSouls shared;

    @SidedProxy(clientSide = "com.thematys.magicalsouls.proxy.MSClientProxy", serverSide = "com.thematys.magicalsouls.proxy.MSServerProxy")
    public static MSCommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Log pre-init start
        MSLog.logInfo("Magical Souls pre-initialization has begun.");

        //Construct the mod's creative tab
        MSReferences.MOD_CREATIVE_TAB = new MSCreativeTab(CreativeTabs.getNextID(), MSReferences.MOD_IDENTIFIER_LC);

        //Load and register the items of the mod
        MSItems.initItems();
        MSItems.registerItems();

        //Load and register the blocks of the mod
        MSBlocks.initBlocks();
        MSBlocks.registerBlocks();

        //Do any other necessary pre-init operations based on the current proxy
        proxy.preInit(event);

        //Log pre-init end
        MSLog.logInfo("Magical Souls pre-initialization has finished successfully.");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MSLog.logInfo("Magical Souls initialization has begun.");

        proxy.init(event);

        MSLog.logInfo("Magical Souls initialization has finished successfully.");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        MSLog.logInfo("Magical Souls post-initialization has begun.");

        proxy.postInit(event);

        MSLog.logInfo("Magical Souls post-initialization has finished successfully.");
    }
}
