package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public enum VictoryCondition implements ScriptValue {
    STANDARD("standard"),
    CONQUEST("conquest"),
    TIME_LIMIT("time-limit"),
    SCORE("score"),
    CUSTOM("custom");
    private final String value;

    private VictoryCondition(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
