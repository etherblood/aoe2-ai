package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public enum Civilization implements ScriptValue {
    MY_CIV("my-civ"),
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

    @Override
    public String value() {
        return value;
    }

}
