package de.cubenation.cnessentials;

import de.cubenation.bedrock.bungee.api.BasePlugin;
import de.cubenation.bedrock.bungee.plugin.BedrockPlugin;
import de.cubenation.bedrock.core.annotation.ArgumentType;
import de.cubenation.bedrock.core.annotation.ConfigurationFile;
import de.cubenation.cnessentials.config.locale.de_DE;
import de.cubenation.cnessentials.model.TestEnumArgument;

import java.util.logging.Level;

@ArgumentType(TestEnumArgument.class)
@ConfigurationFile(de_DE.class)
public class CNEssentialsPlugin extends BasePlugin {

    private static CNEssentialsPlugin instance;

    public static CNEssentialsPlugin getInstance() {
        return instance;
    }

    @Override
    public void onPreEnable() {
        log(Level.INFO, "Yay! It loads");
        instance = this;
    }
}
