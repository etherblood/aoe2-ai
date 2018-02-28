package com.etherblood.aoe2.ai.core.variables.parameters;

/**
 * a valid wall perimeter. Allowed values are 1 and 2, with 1 being closer to
 * the Town Center than 2. Perimeter 1 is usually between 10 and 20 tiles from
 * the starting Town Center. Perimeter 2 is usually between 18 and 30 tiles from
 * the starting Town Center.
 *
 * @author Philipp
 */
public enum Perimeter {
    INNER(0),
    OUTER(1);
    private final int value;

    private Perimeter(int value) {
        this.value = value;
    }

    public String value() {
        return Integer.toString(value);
    }
}
