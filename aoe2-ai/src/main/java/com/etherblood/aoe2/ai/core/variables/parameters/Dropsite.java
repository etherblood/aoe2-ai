package com.etherblood.aoe2.ai.core.variables.parameters;

/**
 *
 * @author Philipp
 */
public enum Dropsite {

    FOOD("food"),
    LIVE_BOAR("live-boar"),
    BOAR_HUNTING("boar-hunting"),
    DEER_HUNTING("deer-hunting"),
    WOOD("wood"),
    GOLD("gold"),
    STONE("stone");

    private final String value;

    private Dropsite(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
