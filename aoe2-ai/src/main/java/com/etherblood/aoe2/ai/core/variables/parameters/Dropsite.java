package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public enum Dropsite implements ScriptValue {

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

    @Override
    public String value() {
        return value;
    }
}
