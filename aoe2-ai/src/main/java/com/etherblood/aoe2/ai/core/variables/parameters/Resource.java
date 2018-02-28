package com.etherblood.aoe2.ai.core.variables.parameters;

/**
 *
 * @author Philipp
 */
public enum Resource {

    FOOD("food"),
    WOOD("wood"),
    GOLD("gold"),
    STONE("stone");

    private final String value;

    private Resource(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
