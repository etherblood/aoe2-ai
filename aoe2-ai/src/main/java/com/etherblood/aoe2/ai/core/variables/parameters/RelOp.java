package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public enum RelOp implements ScriptValue {
    EQUAL("=="), NOT_EQUAL("!="), LESS_THAN("<"), LESS_OR_EQUAL("<="), GREATER_THAN(">"), GREATER_OR_EQUAL(">=");

    private final String value;

    private RelOp(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
