package com.etherblood.aoe2.ai.core.variables.parameters;

/**
 *
 * @author Philipp
 */
public enum DiplomaticStance {
    ALLY("ally"),
    NEUTRAL("neutral"),
    ENEMY("enemy");
    private final String value;

    private DiplomaticStance(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
