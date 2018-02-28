package com.etherblood.aoe2.ai.core.variables.strategicnumbers;

/**
 *
 * @author Philipp
 */
public class StrategicNumber<T> {

    private final String value;
    private final int id;

    public StrategicNumber(String value) {
        this(-1, value);
    }

    public StrategicNumber(int id, String value) {
        this.value = value;
        this.id = id;
    }

    public String value() {
        return value;
    }

    public int id() {
        return id;
    }
}
