package de.cubenation.cnessentials.config;

import de.cubenation.bedrock.core.annotation.CommandToken;
import de.cubenation.bedrock.core.annotation.HelpMenu;
import de.cubenation.bedrock.core.command.Command;
import de.cubenation.cnessentials.command.arg.*;
import de.cubenation.cnessentials.command.teleport.*;

public class CommandConfig {

    @HelpMenu
    @CommandToken("teleport")
    public static class Teleport {

        public static Class<? extends Command> teleport = TeleportCommand.class;

        @CommandToken("player")
        public static Class<? extends Command> teleportPlayer = TeleportCommand.class;

        @CommandToken("here")
        public static Class<? extends Command> teleportHere = TeleportHereCommand.class;

    }

    @HelpMenu
    @CommandToken("arg")
    public static class Arg {

        @HelpMenu
        @CommandToken("plain")
        public static class ArgPlain {

            @CommandToken("string")
            public static Class<? extends Command> argPlainString = ArgPlainStringCommand.class;

            @CommandToken("int")
            public static Class<? extends Command> argPlainInt = ArgPlainIntCommand.class;

            @CommandToken("player")
            public static Class<? extends Command> argPlainPlayer = ArgPlainPlayerCommand.class;

            @CommandToken("enum")
            public static Class<? extends Command> argPlainEnum = ArgPlainEnumCommand.class;

        }

        @HelpMenu
        @CommandToken("opt")
        public static class ArgOpt {

            @CommandToken("string")
            public static Class<? extends Command> argOptString = ArgOptStringCommand.class;

            @CommandToken("plain")
            public static Class<? extends Command> argOptPlain = ArgOptPlainCommand.class;

            @CommandToken("opt")
            public static Class<? extends Command> argOptOpt = ArgOptOptCommand.class;

        }

        @HelpMenu
        @CommandToken("flag")
        public static class ArgFlag {

            @CommandToken("plain")
            public static Class<? extends Command> argFlagPlain = ArgFlagPlainCommand.class;

            @CommandToken("opt")
            public static Class<? extends Command> argFlagOpt = ArgFlagOptCommand.class;

            @CommandToken("enum")
            public static Class<? extends Command> argFlagEnum = ArgFlagEnumCommand.class;

        }

    }
}
