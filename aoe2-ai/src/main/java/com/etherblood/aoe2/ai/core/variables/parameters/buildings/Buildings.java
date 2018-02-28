package com.etherblood.aoe2.ai.core.variables.parameters.buildings;

/**
 *
 * @author Philipp
 */
public enum Buildings implements Building {

    HOUSE("house"),
    MILL("mill"),
    FARM("farm"),
    LUMBER_CAMP("lumber-camp"),
    MINING_CAMP("mining-camp"),
    TOWN_CENTER("town-center"),
    TOWN_CENTER_FOUNDATION("town-center-foundation"),
    BARRACKS("barracks"),
    ARCHERY_RANGE("archery-range"),
    BLACKSMITH("blacksmith"),
    STABLE("stable"),
    MONASTERY("monastery"),
    UNIVERSITY("university"),
    SIEGE_WORKSHOP("siege-workshop"),
    CASTLE("castle");

    private final String var;

    private Buildings(String var) {
        this.var = var;
    }

    @Override
    public String buildingValue() {
        return var;
    }
}
