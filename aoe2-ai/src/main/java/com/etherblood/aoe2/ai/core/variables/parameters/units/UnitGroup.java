package com.etherblood.aoe2.ai.core.variables.parameters.units;

/**
 *
 * @author Philipp
 */
public enum UnitGroup implements Units {
    RANGED_UNITS(900),
    MONUMENT(901),
    TRADE_COG(902),
    BUILDINGS(903),
    VILLAGERS(904),
    FISHING_GROUNDS_FISH(905),
    INFANTRY_UNITS(906),
    FORAGE(907),
    STONE(908),
    TAME_ANIMALS(909),
    WILD_ANIMALS(910),
    CAVALRY_UNITS(912),
    SIEGE_UNITS(913),
    GAIA_EFFECTS_TREE_GROUP(915),
    MONK_UNITS(918),
    TRADE_CARTS(919),
    TRANSPORT_SHIP(920),
    CIVILIAN_BOAT(921),
    MILITARY_BOATS(922),
    CONQUISTADOR(923),
    WALLS(927),
    GOLD(932),
    SHORE_FISH(933),
    PETARD(935),
    CAVALRY_ARCHER_UNITS(936),
    GATES(939),
    RELICS(942),
    MONK_WITH_RELIC(943),
    GUNPOWDER_UNITS(944),
    SCOUTING_CAVALRY_UNITS(947),
    FARMING_OBJECTS(949),
    TREBUCHETS___PACKED(951),
    TOWERS(952),
    TREBUCHETS___UNPACKED(954),
    SCORPION_LINE(955),
    DOMESTIC_ANIMALS(958),
    KING_UNITS(959),
    HORSE(961);
    
    private final int id;

    private UnitGroup(int id) {
        this.id = id;
    }

    @Override
    public String unitValue() {
        return Integer.toString(id);
    }
}
