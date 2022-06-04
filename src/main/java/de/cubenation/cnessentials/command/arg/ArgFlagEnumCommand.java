package de.cubenation.cnessentials.command.arg;

import de.cubenation.bedrock.core.FoundationPlugin;
import de.cubenation.bedrock.core.annotation.Description;
import de.cubenation.bedrock.core.annotation.Option;
import de.cubenation.bedrock.core.command.Command;
import de.cubenation.bedrock.core.wrapper.BedrockChatSender;
import de.cubenation.cnessentials.model.TestEnum;

@Description("wololo")
public class ArgFlagEnumCommand extends Command {

    public ArgFlagEnumCommand(FoundationPlugin plugin) {
        super(plugin);
    }

    public void execute(BedrockChatSender sender, @Option(Description = "wololo", Placeholder = "arg", Key = "key") TestEnum arg) {
        sender.sendMessage("Success! "+arg);
    }
}
