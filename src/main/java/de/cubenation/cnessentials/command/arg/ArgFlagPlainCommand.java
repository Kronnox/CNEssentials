package de.cubenation.cnessentials.command.arg;

import de.cubenation.bedrock.core.FoundationPlugin;
import de.cubenation.bedrock.core.annotation.Description;
import de.cubenation.bedrock.core.annotation.Option;
import de.cubenation.bedrock.core.command.Command;
import de.cubenation.bedrock.core.wrapper.BedrockChatSender;
import de.cubenation.bedrock.core.wrapper.BedrockPlayer;
import de.cubenation.cnessentials.model.TestEnum;

@Description("wololo")
public class ArgFlagPlainCommand extends Command {

    public ArgFlagPlainCommand(FoundationPlugin plugin) {
        super(plugin);
    }

    public void execute(BedrockChatSender sender, BedrockPlayer arg, @Option(Description = "wololo", Placeholder = "arg2", Key = "key") TestEnum arg2) {
        sender.sendMessage("Success! arg:"+arg.getDisplayName()+" arg2:"+arg2);
    }
}
