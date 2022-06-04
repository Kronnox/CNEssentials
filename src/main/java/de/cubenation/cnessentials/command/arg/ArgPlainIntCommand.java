package de.cubenation.cnessentials.command.arg;

import de.cubenation.bedrock.core.FoundationPlugin;
import de.cubenation.bedrock.core.annotation.Description;
import de.cubenation.bedrock.core.command.Command;
import de.cubenation.bedrock.core.wrapper.BedrockChatSender;

@Description("wololo")
public class ArgPlainIntCommand extends Command {

    public ArgPlainIntCommand(FoundationPlugin plugin) {
        super(plugin);
    }

    public void execute(BedrockChatSender sender, Integer arg) {
        sender.sendMessage("Success! "+arg);
    }
}
