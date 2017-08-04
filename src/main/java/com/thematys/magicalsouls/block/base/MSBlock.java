package com.thematys.magicalsouls.block.base;

import com.thematys.magicalsouls.reference.MSReferences;
import com.thematys.magicalsouls.util.localization.MSILocalizable;
import com.thematys.magicalsouls.util.localization.MSLocalizationGroup;
import com.thematys.magicalsouls.util.localization.MSLocalizer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MSBlock extends Block implements MSILocalizable
{
    private String name;

    public MSBlock(String name, Material material)
    {
        super(material);
        this.setUnlocalizedName(name);
        this.setCreativeTab(MSReferences.MOD_CREATIVE_TAB);
    }

    public MSBlock(String name)
    {
        this(name, Material.ROCK);
    }

    public MSBlock(Material materialIn)
    {
        this("", materialIn);
    }

    @Override
    public Block setUnlocalizedName(String name)
    {
        this.name = name;
        return super.setUnlocalizedName(name);
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
        return MSLocalizationGroup.block;
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
