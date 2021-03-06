package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public class GoalId implements ScriptValue {

    private final int value;

    public GoalId(int value) {
        this.value = value;
    }

    @Override
    public String value() {
        return Integer.toString(value);
    }
}
