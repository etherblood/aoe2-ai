package com.etherblood.aoe2.ai.core.facts;

import java.util.function.Consumer;

public class BinaryOperationFact implements Fact {

    private final String operator;
    private final Fact a, b;

    public BinaryOperationFact(String operator, Fact a, Fact b) {
        this.operator = operator;
        this.a = a;
        this.b = b;
    }

    @Override
    public void unparse(Consumer<String> output) {
        output.accept(operator);
        output.accept("(");
        a.unparse(output);
        output.accept(")(");
        b.unparse(output);
        output.accept(")");
    }

}
