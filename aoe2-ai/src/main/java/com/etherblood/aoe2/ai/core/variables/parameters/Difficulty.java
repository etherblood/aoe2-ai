package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 * The ordering of difficulty settings is the opposite of what one would expect!
 * Make sure that this is taken in account when using facts to compare
 * difficulties. easiest > easy > moderate > hard > hardest
 *
 * @author Philipp
 */
public enum Difficulty implements ScriptValue {
    HARDEST("hardest"), HARD("hard"), MODERATE("moderate"), EASY("easy"), EASIEST("easiest");
    private final String value;

    private Difficulty(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
