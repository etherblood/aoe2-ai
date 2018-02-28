package com.etherblood.aoe2.ai.core.variables.parameters;

/**
 *
 * @author Philipp
 */
public enum Commodity {
    FOOD("food"), STONE("stone"), WOOD("wood");
    private final String value;

    private Commodity(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
