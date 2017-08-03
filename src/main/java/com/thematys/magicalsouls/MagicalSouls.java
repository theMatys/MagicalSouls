package com.thematys.magicalsouls;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "magicalsouls", version = "1.10.2-1.0-001")
public class MagicalSouls
{
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Magical Souls has been initialized.");
    }
}
