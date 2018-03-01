package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public enum MapSize implements ScriptValue {
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

    @Override
    public String value() {
        return value;
    }
}
