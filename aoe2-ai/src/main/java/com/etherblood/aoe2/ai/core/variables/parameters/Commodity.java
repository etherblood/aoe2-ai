package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public enum Commodity implements ScriptValue {
    FOOD("food"), STONE("stone"), WOOD("wood");
    private final String value;

    private Commodity(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
