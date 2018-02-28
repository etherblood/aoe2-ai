package com.etherblood.aoe2.ai.core.variables.parameters;

/**
 *
 * @author Philipp
 */
public class GoalId {

    private final int value;

    public GoalId(int value) {
        this.value = value;
    }

    public String value() {
        return Integer.toString(value);
    }
}
