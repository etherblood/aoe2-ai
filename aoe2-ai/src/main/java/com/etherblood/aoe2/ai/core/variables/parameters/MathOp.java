package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public enum MathOp implements ScriptValue {
    ADD("c:+"), SUB("c:-"), MULT("c:*"), DIVIDE("c:/"), MODULO("c:%");

    private final String value;

    private MathOp(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
