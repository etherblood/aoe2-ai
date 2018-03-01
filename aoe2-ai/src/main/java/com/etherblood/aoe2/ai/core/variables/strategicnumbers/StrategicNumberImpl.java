package com.etherblood.aoe2.ai.core.variables.strategicnumbers;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
class StrategicNumberImpl<T extends ScriptValue> implements StrategicNumber {

    private final String value;
    private final int id;

    public StrategicNumberImpl(String value) {
        this(-1, value);
    }

    public StrategicNumberImpl(int id, String value) {
        this.value = value;
        this.id = id;
    }

    @Override
    public String value() {
        return value;
    }

    public int id() {
        return id;
    }
}
