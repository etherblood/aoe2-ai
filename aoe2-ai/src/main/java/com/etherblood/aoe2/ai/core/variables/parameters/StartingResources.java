package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public enum StartingResources implements ScriptValue {
    LOW_RESOURCES("low-resources"),
    MEDIUM_RESOURCES("medium-resources"),
    HIGH_RESOURCES("high-resources");
    private final String value;

    private StartingResources(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
