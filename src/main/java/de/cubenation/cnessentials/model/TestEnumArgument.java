package de.cubenation.cnessentials.model;

import de.cubenation.bedrock.core.FoundationPlugin;
import de.cubenation.bedrock.core.command.argument.type.EnumArgument;

public class TestEnumArgument extends EnumArgument<TestEnum> {

    public TestEnumArgument(FoundationPlugin plugin) {
        super(plugin);
    }
}
