package de.cubenation.cnessentials.config;

import de.cubenation.bedrock.core.FoundationPlugin;

import java.io.File;

public class BedrockDefaults extends de.cubenation.bedrock.core.config.BedrockDefaults {

    public BedrockDefaults(FoundationPlugin plugin) {
        CONFIG_FILE = new File(plugin.getDataFolder(), de.cubenation.bedrock.core.config.BedrockDefaults.getFilename());
        CONFIG_HEADER = getHeader();

        this.setColorSchemeName("RED");
        this.setLocalizationLocale("de_DE");
    }

}

