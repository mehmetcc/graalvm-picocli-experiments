package org.mehmetcc.command;

import picocli.CommandLine;

@CommandLine.Command(name = "graal-cli",
        version = "0.0.1",
        subcommands = {},
        mixinStandardHelpOptions = true)
public class RootCommand implements Runnable {
    @CommandLine.Mixin
    private GraalFlag graalFlag;

    @Override
    public void run() {
        if (graalFlag.isEnabled()) System.out.println("GraalVM builds are enabled.");
        else System.out.println("GraalVM builds are not enabled.");
    }
}
