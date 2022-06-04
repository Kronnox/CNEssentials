package de.cubenation.cnessentials.message;

import de.cubenation.bedrock.core.translation.JsonMessage;
import de.cubenation.bedrock.core.wrapper.BedrockChatSender;
import de.cubenation.bedrock.core.wrapper.BedrockPlayer;
import de.cubenation.cnessentials.CNEssentialsPlugin;

public class Messages {

    private static final CNEssentialsPlugin plugin = CNEssentialsPlugin.getInstance();

    public static class Command {

        public static void TeleportSuccess(BedrockChatSender sender) {
            new JsonMessage(plugin, "command.teleport.success").send(sender);
        }
    }
}
