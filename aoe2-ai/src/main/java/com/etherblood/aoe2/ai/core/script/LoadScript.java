package com.etherblood.aoe2.ai.core.script;

import java.util.function.Consumer;


public class LoadScript implements Script {

    private final String filename;

    public LoadScript(String filename) {
        this.filename = filename;
    }
    
    @Override
    public void unparse(Consumer<String> output) {
        output.accept("(load \"");
        output.accept(filename);
        output.accept("\")");
    }

}
