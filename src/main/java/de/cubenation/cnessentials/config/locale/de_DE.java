package de.cubenation.cnessentials.config.locale;

import de.cubenation.bedrock.core.FoundationPlugin;
import de.cubenation.bedrock.core.config.CustomConfigurationFile;
import net.cubespace.Yamler.Config.Path;

import java.io.File;

public class de_DE extends CustomConfigurationFile {

    public static String getFilename() {
        return "locale" + File.separator + "de_DE.yml";
    }

    public de_DE(FoundationPlugin plugin) {
        CONFIG_FILE = new File(plugin.getDataFolder(), getFilename());
    }

    @Path("command.teleport.success")
    private String command_teleport_success = "{\"text\":\"\",\"extra\":[{\"text\":\"%plugin_prefix%\"},{\"text\":\" \",\"color\":\"white\"},{\"text\":\"Teleportiere...\",\"color\":\"&TEXT&\"}]}";
}
