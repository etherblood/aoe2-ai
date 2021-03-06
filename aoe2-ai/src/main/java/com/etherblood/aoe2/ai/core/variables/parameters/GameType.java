package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public enum GameType implements ScriptValue {
    RANDOM(0),
    REGICIDE(1),
    DEATH_MATCH(2),
    SCENARIO(3),
    KING_OF_THE_HILL(5),
    WONDER_RACE(6),
    DEFEND_THE_WONDER(7),
    TURBO_RANDOM(8);
    private final int value;

    private GameType(int value) {
        this.value = value;
    }

    @Override
    public String value() {
        return Integer.toString(value);
    }
}
