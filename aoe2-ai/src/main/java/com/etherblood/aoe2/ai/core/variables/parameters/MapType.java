package com.etherblood.aoe2.ai.core.variables.parameters;

/**
 *
 * @author Philipp
 */
public enum MapType {
    ARABIA("arabia"),
    ARCHIPELAGO("archipelago"),
    BALTIC("baltic"),
    BLACK_FOREST("black-forest"),
    COASTAL("coastal"),
    CONTINENTAL("continental"),
    CRATER_LAKE("crater-lake"),
    FORTRESS("fortress"),
    GOLD_RUSH("gold-rush"),
    HIGHLAND("highland"),
    ISLANDS("islands"),
    MEDITERRANEAN("mediterranean"),
    MIGRATION("migration"),
    RIVERS("rivers"),
    TEAM_ISLANDS("team-islands"),
    SCANDANAVIA("scandanavia"),
    MONGOLIA("mongolia"),
    SALT_MARSH("salt-marsh"),
    YUCATAN("yucatan"),
    ARENA("arena"),
    OASIS("oasis"),
    GHOST_LAKE("ghost-lake"),
    NOMAD("nomad"),
    REAL_WORLD_SPAIN("real-world-spain"),
    REAL_WORLD_ENGLAND("real-world-england"),
    REAL_WORLD_MIDEAST("real-world-midEast"),
    REAL_WORLD_TEXAS("real-world-texas"),
    REAL_WORLD_ITALY("real-world-italy"),
    REAL_WORLD_CARIBBEAN("real-world-caribbean"),
    REAL_WORLD_FRANCE("real-world-france"),
    REAL_WORLD_JUTLAND("real-world-jutland"),
    REAL_WORLD_NIPPON("real-world-nippon"),
    REAL_WORLD_BYZANTIUM("real-world-byzantium"),
    CUSTOM_MAP("custom_map"),
    SCENARIO_MAP("scenario-map");
    private final String value;

    private MapType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
