package com.etherblood.aoe2.ai.core.variables.parameters;

/**
 *
 * @author Philipp
 */
public enum MapSize {
    TINY("tiny"),
    SMALL("small"),
    MEDIUM("medium"),
    NORMAL("normal"),
    LARGE("large"),
    GIANT("giant");
    private final String value;

    private MapSize(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
