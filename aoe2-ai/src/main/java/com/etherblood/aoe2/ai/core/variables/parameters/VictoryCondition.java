package com.etherblood.aoe2.ai.core.variables.parameters;

/**
 *
 * @author Philipp
 */
public enum VictoryCondition {
    STANDARD("standard"),
    CONQUEST("conquest"),
    TIME_LIMIT("time-limit"),
    SCORE("score"),
    CUSTOM("custom");
    private final String value;

    private VictoryCondition(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
