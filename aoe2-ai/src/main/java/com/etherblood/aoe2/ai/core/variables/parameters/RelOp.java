package com.etherblood.aoe2.ai.core.variables.parameters;

/**
 *
 * @author Philipp
 */
public enum RelOp {
    EQUAL("=="), NOT_EQUAL("!="), LESS_THAN("<"), LESS_OR_EQUAL("<="), GREATER_THAN(">"), GREATER_OR_EQUAL(">=");

    private final String value;

    private RelOp(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
