package com.etherblood.aoe2.ai.core.variables;

/**
 *
 * @author Philipp
 */
public enum DifficultyParameter implements ScriptValue {
    ABILITY_TO_DODGE_MISSLES("ability-to-dodge-missiles"),
    ABILITY_TO_MAINTAIN_DISTANCE("ability-to-maintain-distance");
    
    private final String value;

    private DifficultyParameter(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

}
