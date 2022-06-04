package de.cubenation.cnessentials.command.arg;

import de.cubenation.bedrock.core.FoundationPlugin;
import de.cubenation.bedrock.core.annotation.Description;
import de.cubenation.bedrock.core.command.Command;
import de.cubenation.bedrock.core.wrapper.BedrockChatSender;
import de.cubenation.cnessentials.model.TestEnum;

@Description("wololo")
public class ArgPlainEnumCommand extends Command {

    public ArgPlainEnumCommand(FoundationPlugin plugin) {
        super(plugin);
    }

    public void execute(BedrockChatSender sender, TestEnum arg) {
        sender.sendMessage("Success! "+arg);
    }
}
