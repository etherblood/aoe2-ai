package com.etherblood.aoe2.ai.core.variables;

/**
 *
 * @author Philipp
 */
public enum ResearchStatus {

    UNAVAILABLE(0),
    AVAILABLE(1),
    PENDING(2),
    COMPLETE(3);

    private final int var;

    private ResearchStatus(int var) {
        this.var = var;
    }

    public String value() {
        return Integer.toString(var);
    }
}
