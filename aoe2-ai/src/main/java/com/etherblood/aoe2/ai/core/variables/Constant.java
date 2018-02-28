package com.etherblood.aoe2.ai.core.variables;

import java.util.function.Consumer;

/**
 *
 * @author Philipp
 */
public class Constant {

    private final String var;
    private final String value;

    public Constant(String var, String value) {
        this.var = var;
        this.value = value;
    }

    public void unparseDeclaration(Consumer<String> output) {
        output.accept("(defconst " + var + " " + value + ")");
    }

    public String getValue() {
        return value;
    }

    public String var() {
        return var;
    }
}
