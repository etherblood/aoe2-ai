package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public enum TypeOp implements ScriptValue {
    C("c:"), S("s:"), G("g:");

    private final String value;

    private TypeOp(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
