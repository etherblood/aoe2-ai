package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public enum DiplomaticStance implements ScriptValue {
    ALLY("ally"),
    NEUTRAL("neutral"),
    ENEMY("enemy");
    private final String value;

    private DiplomaticStance(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
