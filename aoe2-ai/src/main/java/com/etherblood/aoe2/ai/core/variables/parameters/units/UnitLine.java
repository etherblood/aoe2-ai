package com.etherblood.aoe2.ai.core.variables.parameters.units;

/**
 *
 * @author Philipp
 */
public enum UnitLine implements Units {
    MY_UNIQUE_UNIT_LINE(Integer.MAX_VALUE, "my-unique-unit-line"),
    STONE_WALL_LINE(-399, "stone-wall-line"),
    WATCH_TOWER_LINE(-398, "watch-tower-line"),
    ARCHER_LINE(-299, "archer-line"),
    CAVALRY_ARCHER_LINE(-298, "cavalry-archer-line"),
    MILITIA_LINE(-296, "militiaman-line"),
    SKIRMISHER_LINE(-295, "spearman-line"),
    SPEARMAN_LINE(-295, "spearman-line"),
    DEMOLITION_SHIP_LINE(-294, "demolition-ship-line"),
    FIRE_SHIP(-293, "fire-ship-line"),
    GALLEY_LINE(-292, "galley-line"),
    BATTERING_RAM_LINE(-291, "battering-ram-line"),
    MANGONEL_LINE(-290, "mangonel-line"),
    SCORPION_LINE(-289, "scorpion-line"),
    CAMEL_LINE(-288, "camel-line"),
    KNIGHT_LINE(-287, "knight-line"),
    SCOUT_CAVALRY_LINE(-286, "scout-cavalry-line"),
    CANNON_GALLEON_LINE(-285, "cannon-galleon-line"),
    LONGBOAT_LINE(-284, "longboat-line"),
    TURTLE_SHIP_LINE(-283, "turtle-ship-line"),
    BERSERK_LINE(-282, "berserk-line"),
    CATAPHRACT_LINE(-281, "cataphract-line"),
    CHU_KO_NU_LINE(-280, "chu-ko-nu-line"),
    _CASTLE_HUSKARL_LINE(-279, "huskarl-line"),
    JANISSARY_LINE(-278, "janissary-line"),
    LONGBOWMAN_LINE(-277, "longbowman-line"),
    MAMELUKE_LINE(-276, "mameluke-line"),
    MANGUDAI_LINE(-275, "mangudai-line"),
    SAMURAI_LINE(-274, "samurai-line"),
    TEUTONIC_KNIGHT_LINE(-273, "teutonic-knight-line"),
    THROWING_AXEMAN_LINE(-272, "throwing-axeman-line"),
    WAR_ELEPHANT_LINE(-271, "war-elephant-line"),
    WAR_WAGON_LINE(-270, "war-wagon-line"),
    WOAD_RAIDER_LINE(-269, "woad-raider-line"),
    JAGUAR_WARRIOR_LINE(-268, "jaguar-man-line"),
    EAGLE_WARRIOR_LINE(-267, "eagle-warrior-line"),
    PLUMED_ARCHER_LINE(-266, "plumed-archer-line"),
    TARKAN_LINE(-265, "tarkan-line"),
    CONQUISTADOR_LINE(-264, "conquistador-line"),
    VILLAGER_HUNTER(-255, "villager-hunter"),
    GATE_UPWARD_SLOPING_(81, "81"),
    VILLAGER(83, "villager"),
    GATE_DOWNWARD_SLOPING_(95, "95"),
    GATE_HORIZONTAL_(663, "663"),
    GATE_VERTICAL_(671, "671");

    private final int id;
    private final String name;

    private UnitLine(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String value() {
        return name;
    }
}
