package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public enum Age implements ScriptValue {
    DARK_AGE("dark-age"),
    FEUDAL_AGE("feudal-age"),
    CASTLE_AGE("castle-age"),
    IMPERIAL_AGE("imperial-age"),
    POST_IMPERIAL_AGE("post-imperial-age");

    private final String value;

    private Age(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
