package com.galvanize.oop;

public class CompiledProgrammingLanguage extends ProgrammingLanguage {
    private String name;
    private String compilerCommand;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getCompilerCommand() {
        return compilerCommand;
    }

    public void setCompilerCommand(String compilerCommand) {
        this.compilerCommand = compilerCommand;
    }

    @Override
    public String toString() {
        return (name
                + " (compiled with "
                + compilerCommand
                + ")");
    }
}
