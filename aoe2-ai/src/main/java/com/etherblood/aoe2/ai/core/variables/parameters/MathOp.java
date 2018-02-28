package com.etherblood.aoe2.ai.core.variables.parameters;

/**
 *
 * @author Philipp
 */
public enum MathOp {
    ADD("c:+"), SUB("c:-"), MULT("c:*"), DIVIDE("c:/"), MODULO("c:%");

    private final String value;

    private MathOp(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
