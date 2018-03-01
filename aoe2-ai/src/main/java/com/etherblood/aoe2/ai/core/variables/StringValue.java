package com.etherblood.aoe2.ai.core.variables;

public class StringValue implements ScriptValue {

    private final String value;

    private StringValue(String value) {
        this.value = value;
    }
    
    public static StringValue of(String value) {
        return new StringValue(value);
    }

    @Override
    public String value() {
        return "\"" + value + "\"";
    }

}
