package de.cubenation.cnessentials.command.arg;

import de.cubenation.bedrock.core.FoundationPlugin;
import de.cubenation.bedrock.core.annotation.Description;
import de.cubenation.bedrock.core.command.Command;
import de.cubenation.bedrock.core.wrapper.BedrockChatSender;
import de.cubenation.bedrock.core.wrapper.BedrockPlayer;

@Description("wololo")
public class ArgPlainPlayerCommand extends Command {

    public ArgPlainPlayerCommand(FoundationPlugin plugin) {
        super(plugin);
    }

    public void execute(BedrockChatSender sender, BedrockPlayer arg) {
        sender.sendMessage("Success! "+arg.getDisplayName());
    }
}
