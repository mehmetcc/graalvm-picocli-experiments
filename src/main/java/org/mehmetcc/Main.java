package org.mehmetcc;

import org.mehmetcc.command.RootCommand;
import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
        new CommandLine(RootCommand.class).execute(args);
    }
}