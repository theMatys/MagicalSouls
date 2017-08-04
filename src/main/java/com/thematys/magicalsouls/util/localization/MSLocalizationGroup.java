package com.thematys.magicalsouls.util.localization;

public enum MSLocalizationGroup
{
    none(""),
    item(".item."),
    block(".block.");

    private String value;

    MSLocalizationGroup(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }
}
