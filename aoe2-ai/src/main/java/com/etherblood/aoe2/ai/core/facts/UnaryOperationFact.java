package com.etherblood.aoe2.ai.core.facts;

import java.util.function.Consumer;

public class UnaryOperationFact implements Fact {

    private final String operator;
    private final Fact fact;

    public UnaryOperationFact(String operator, Fact fact) {
        this.operator = operator;
        this.fact = fact;
    }

    @Override
    public void unparse(Consumer<String> output) {
        output.accept(operator);
        output.accept("(");
        fact.unparse(output);
        output.accept(")");
    }

}
