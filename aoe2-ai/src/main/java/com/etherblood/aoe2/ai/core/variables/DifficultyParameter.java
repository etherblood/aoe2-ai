package com.etherblood.aoe2.ai.core.variables;

/**
 *
 * @author Philipp
 */
public class DifficultyParameter<T> {

    private final String value;

    public DifficultyParameter(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}
