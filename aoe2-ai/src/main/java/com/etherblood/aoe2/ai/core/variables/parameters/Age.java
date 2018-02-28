package com.etherblood.aoe2.ai.core.variables.parameters;

/**
 *
 * @author Philipp
 */
public enum Age {
    DARK_AGE("dark-age"),
    FEUDAL_AGE("feudal-age"),
    CASTLE_AGE("castle-age"),
    IMPERIAL_AGE("imperial-age"),
    POST_IMPERIAL_AGE("post-imperial-age");
    
    private final String value;

    private Age(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
