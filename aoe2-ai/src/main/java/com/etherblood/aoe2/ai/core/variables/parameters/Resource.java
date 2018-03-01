package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public enum Resource implements ScriptValue {

    FOOD("food"),
    WOOD("wood"),
    GOLD("gold"),
    STONE("stone");

    private final String value;

    private Resource(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
