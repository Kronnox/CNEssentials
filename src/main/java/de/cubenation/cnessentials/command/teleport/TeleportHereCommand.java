package de.cubenation.cnessentials.command.teleport;

import de.cubenation.bedrock.core.FoundationPlugin;
import de.cubenation.bedrock.core.annotation.Description;
import de.cubenation.bedrock.core.annotation.IngameCommand;
import de.cubenation.bedrock.core.annotation.Permission;
import de.cubenation.bedrock.core.authorization.Role;
import de.cubenation.bedrock.core.command.Command;
import de.cubenation.bedrock.core.wrapper.BedrockChatSender;
import de.cubenation.bedrock.core.wrapper.BedrockPlayer;
import de.cubenation.cnessentials.message.Messages;

@IngameCommand
@Description("command.cnessentials.cmd.teleport.here.desc")
@Permission(Name = "teleport.here.player", Role = Role.SUPPORTER)
public class TeleportHereCommand extends Command {

    public TeleportHereCommand(FoundationPlugin plugin) {
        super(plugin);
    }

    public void execute(BedrockChatSender sender, BedrockPlayer player) {
        BedrockPlayer to = (BedrockPlayer) sender;
        Messages.Command.TeleportSuccess(sender);
        player.teleport(to);
    }
}
