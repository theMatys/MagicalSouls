package com.thematys.magicalsouls.util.localization;

import com.thematys.magicalsouls.reference.MSReferences;
import com.thematys.magicalsouls.util.MSLog;

import net.minecraft.util.text.TextComponentTranslation;

public class MSLocalizer
{
    public static String localize(MSILocalizable localizable)
    {
        String translationKey = localizable.isPostfixed() ? localizable.getUnlocalizedName() + localizable.getPostfix() : localizable.getUnlocalizedName();
        String translation = new TextComponentTranslation(translationKey).getFormattedText();
        String missing = new TextComponentTranslation(MSReferences.Defaults.UnlocalizedName.DEFAULT_UNLOCALIZED_NAME).getUnformattedComponentText();

        MSLog.logInfo("[LOCALIZER]: Localized " + translationKey + (translation.equals(translationKey) ? ", but did not receive a proper localized result. Returning the missing default..." : "and received localized result: " + translation + ". Returning the localized result..."));

        return translation.equals(translationKey) ? missing : translation;
    }

    public static String unlocalizedName(MSILocalizable localizable)
    {
        return unlocalizedName(localizable.getName(), localizable.getLocalizationGroup());
    }

    public static String unlocalizedName(String baseUnlocalizedName, MSLocalizationGroup localizationGroup)
    {
        return MSReferences.MOD_IDENTIFIER_LC + localizationGroup.getValue() + baseUnlocalizedName;
    }
}

