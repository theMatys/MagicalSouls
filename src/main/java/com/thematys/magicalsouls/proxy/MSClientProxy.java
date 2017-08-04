package com.thematys.magicalsouls.proxy;

import com.thematys.magicalsouls.block.base.MSBlock;
import com.thematys.magicalsouls.init.MSBlocks;
import com.thematys.magicalsouls.init.MSItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class MSClientProxy extends MSCommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        //Register item and block models
        MSItems.registerItemModels();
        MSBlocks.registerBlockModels();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
