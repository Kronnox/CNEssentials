package de.cubenation.cnessentials.command.arg;

import de.cubenation.bedrock.core.FoundationPlugin;
import de.cubenation.bedrock.core.annotation.Argument;
import de.cubenation.bedrock.core.annotation.Description;
import de.cubenation.bedrock.core.command.Command;
import de.cubenation.bedrock.core.wrapper.BedrockChatSender;
import de.cubenation.bedrock.core.wrapper.BedrockPlayer;
import de.cubenation.cnessentials.model.TestEnum;

@Description("wololo")
public class ArgOptPlainCommand extends Command {

    public ArgOptPlainCommand(FoundationPlugin plugin) {
        super(plugin);
    }

    public void execute(BedrockChatSender sender, BedrockPlayer arg, @Argument(Description = "wololo", Placeholder = "arg2", Optional = true) TestEnum arg2) {
        sender.sendMessage("Success! arg:"+arg+" arg2:"+arg2);
    }
}
