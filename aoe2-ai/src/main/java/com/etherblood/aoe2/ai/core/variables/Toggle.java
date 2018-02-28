package com.etherblood.aoe2.ai.core.variables;

/**
 *
 * @author Philipp
 */
public enum Toggle implements HasValue {
    OFF(0), ON(1);

    private final int value;

    private Toggle(int value) {
        this.value = value;
    }

    @Override
    public String value() {
        return Integer.toString(value);
    }
}
