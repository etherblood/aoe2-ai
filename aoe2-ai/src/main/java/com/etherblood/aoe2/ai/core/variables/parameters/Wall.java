package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public enum Wall implements ScriptValue {
    FORTIFIED_WALL("fortified-wall"),
    PALISADE_WALL("palisade-wall"),
    STONE_WALL("stone-wall"),
    STONE_WALL_LINE("stone-wall-line");
    private final String value;

    private Wall(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
