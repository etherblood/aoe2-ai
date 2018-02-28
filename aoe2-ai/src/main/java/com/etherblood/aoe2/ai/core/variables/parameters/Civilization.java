package com.etherblood.aoe2.ai.core.variables.parameters;

/**
 *
 * @author Philipp
 */
public enum Civilization {

    GAIA("gaia"),
    AZTEC("aztec"),
    BRITON("briton"),
    BYZANTINE("byzantine"),
    CELTIC("celtic"),
    CHINESE("chinese"),
    FRANKISH("frankish"),
    GOTHIC("gothic"),
    HUN("hun"),
    JAPANESE("japanese"),
    KOREAN("korean"),
    MAYAN("mayan"),
    MONGOL("mongol"),
    PERSIAN("persian"),
    SARACEN("saracen"),
    SPANISH("spanish"),
    TEUTONIC("teutonic"),
    TURCISH("turkish"),
    VIKING("viking");
    
    private final String value;

    private Civilization(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}
