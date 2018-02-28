package com.etherblood.aoe2.ai.core.facts;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class FactImpl implements Fact {

    private final String script;

    public FactImpl(String... parts) {
        this.script = Arrays.stream(parts).collect(Collectors.joining(" "));
    }

    @Override
    public void unparse(Consumer<String> output) {
        output.accept(script);
    }
}
