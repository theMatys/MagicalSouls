package com.thematys.magicalsouls.util.localization;

public interface MSILocalizable
{
    String getName();

    String getUnlocalizedName();

    MSLocalizationGroup getLocalizationGroup();

    boolean isPostfixed();

    String getPostfix();
}
