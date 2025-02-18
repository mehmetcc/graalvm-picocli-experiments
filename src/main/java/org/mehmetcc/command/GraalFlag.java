package org.mehmetcc.command;

import picocli.CommandLine;

public class GraalFlag {
    @CommandLine.Option(names = {"-GVM", "--graalvm"}, description = "Enable GraalVM mode")
    private Boolean enabled = Boolean.FALSE;

    public Boolean isEnabled() {
        return enabled;
    }
}
