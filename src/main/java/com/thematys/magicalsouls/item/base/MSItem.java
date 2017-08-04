package com.thematys.magicalsouls.item.base;

import com.thematys.magicalsouls.reference.MSReferences;
import com.thematys.magicalsouls.util.localization.MSILocalizable;
import com.thematys.magicalsouls.util.localization.MSLocalizationGroup;
import com.thematys.magicalsouls.util.localization.MSLocalizer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MSItem extends Item implements MSILocalizable
{
    private String name;

    public MSItem()
    {
        super();
        this.setCreativeTab(MSReferences.MOD_CREATIVE_TAB);
    }

    public MSItem(String name)
    {
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(MSReferences.MOD_CREATIVE_TAB);
    }

    @Override
    public Item setUnlocalizedName(String unlocalizedName)
    {
        name = unlocalizedName;
        return super.setUnlocalizedName(unlocalizedName);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return getUnlocalizedName();
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getUnlocalizedName()
    {
        return MSLocalizer.unlocalizedName(this);
    }

    @Override
    public MSLocalizationGroup getLocalizationGroup()
    {
        return MSLocalizationGroup.item;
    }

    @Override
    public boolean isPostfixed()
    {
        return true;
    }

    @Override
    public String getPostfix()
    {
        return MSReferences.Defaults.UnlocalizedName.DEFAULT_UNLOCALIZED_NAME_POSTFIX;
    }
}
