package com.etherblood.aoe2.ai.core.facts;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;
import java.util.function.Consumer;

class FactImpl implements Fact {

    private final String command;
    private final ScriptValue[] args;

    public FactImpl(String command, ScriptValue... args) {
        this.command = command;
        this.args = args;
    }

    @Override
    public void unparse(Consumer<String> output) {
        output.accept(command);
        for (ScriptValue arg : args) {
            output.accept(" ");
            output.accept(arg.value());
        }
    }
}
