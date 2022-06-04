package de.cubenation.cnessentials.command.arg;

import de.cubenation.bedrock.core.FoundationPlugin;
import de.cubenation.bedrock.core.annotation.Argument;
import de.cubenation.bedrock.core.annotation.Description;
import de.cubenation.bedrock.core.command.Command;
import de.cubenation.bedrock.core.wrapper.BedrockChatSender;

@Description("wololo")
public class ArgOptStringCommand extends Command {

    public ArgOptStringCommand(FoundationPlugin plugin) {
        super(plugin);
    }

    public void execute(BedrockChatSender sender, @Argument(Description = "wololo", Placeholder = "arg", Optional = true) String arg) {
        sender.sendMessage("Success! "+arg);
    }
}
