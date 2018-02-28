package com.etherblood.aoe2.ai.core.actions;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class ActionImpl implements Action {

    private final String script;

    public ActionImpl(String... parts) {
        this.script = Arrays.stream(parts).collect(Collectors.joining(" "));
    }

    @Override
    public void unparse(Consumer<String> output) {
        output.accept(script);
    }
}
