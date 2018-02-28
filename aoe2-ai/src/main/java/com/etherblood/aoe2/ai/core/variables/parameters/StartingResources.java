package com.etherblood.aoe2.ai.core.variables.parameters;

/**
 *
 * @author Philipp
 */
public enum StartingResources {
    LOW_RESOURCES("low-resources"),
    MEDIUM_RESOURCES("medium-resources"),
    HIGH_RESOURCES("high-resources");
    private final String value;

    private StartingResources(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
