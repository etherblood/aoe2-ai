package com.etherblood.aoe2.ai.core.variables.strategicnumbers;


class IntStrategicNumber implements StrategicNumber<Integer> {

    private final String value;
    private final int id;

    public IntStrategicNumber(String value) {
        this(-1, value);
    }

    public IntStrategicNumber(int id, String value) {
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
