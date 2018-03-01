package com.etherblood.aoe2.ai.core.variables;

public class IntValue implements ScriptValue {

    private final int value;

    private IntValue(int value) {
        this.value = value;
    }
    
    public static IntValue of(int value) {
        return new IntValue(value);
    }

    @Override
    public String value() {
        return Integer.toString(value);
    }

}
