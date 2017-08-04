package com.thematys.magicalsouls.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class MSCreativeTab extends CreativeTabs
{
    public MSCreativeTab(int index, String label)
    {
        super(index, label);
    }

    @Override
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(Blocks.SOUL_SAND);
    }
}
