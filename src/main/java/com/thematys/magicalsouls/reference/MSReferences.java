package com.thematys.magicalsouls.reference;

import com.thematys.magicalsouls.util.MSCreativeTab;
import com.thematys.magicalsouls.util.localization.MSLocalizationGroup;
import com.thematys.magicalsouls.util.localization.MSLocalizer;

public class MSReferences
{
    //Mod defaults
    public static final String MOD_IDENTIFIER = "MagicalSouls";
    public static final String MOD_IDENTIFIER_LC = "magicalsouls";
    public static final String MOD_NAME = "Magical Souls";
    public static final String MOD_ACCEPTED_MINECRAFT_VERSION = "1.10.2";

    //Mod version components
    private static final String MOD_VERSION_NUMBER = "1.0";
    private static final String MOD_BUILD_NUMBER = "001";

    //Mod version
    public static final String MOD_VERSION = MOD_ACCEPTED_MINECRAFT_VERSION + "-" + MOD_VERSION_NUMBER + "-" + MOD_BUILD_NUMBER;

    //Mod creative tab
    public static MSCreativeTab MOD_CREATIVE_TAB;

    public static class Defaults
    {
        public static class UnlocalizedName
        {
            public static final String DEFAULT_UNLOCALIZED_NAME = MSLocalizer.unlocalizedName("default_name", MSLocalizationGroup.none);
            public static final String DEFAULT_UNLOCALIZED_NAME_POSTFIX = ".name";
        }
    }
}
