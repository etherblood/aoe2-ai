package com.etherblood.aoe2.ai.core.variables.parameters;

import com.etherblood.aoe2.ai.core.variables.ScriptValue;

/**
 *
 * @author Philipp
 */
public enum TauntId implements ScriptValue {
    YES(1),
    NO(2),
    FOOD_PLEASE(3),
    WOOD_PLEASE(4),
    GOLD_PLEASE(5),
    STONE_PLEASE(6),
    AHH(7),
    ALL_HAIL_KING_OF_THE_LOSERS(8),
    OOH(9),
    ILL_BEAT_YOU_BACK_TO_AGE_OF_EMPIRES(10),
    HERB_LAUGH(11),
    AH_BEING_RUSHED(12),
    SURE_BLAME_IT_ON_YOUR_ISP(13),
    START_THE_GAME_ALREADY(14),
    DONT_POINT_THAT_THING_AT_ME(15),
    ENEMY_SIGHTED(16),
    IT_IS_GOOD_TO_BE_THE_KING(17),
    MONK_I_NEED_A_MONK(18),
    LONG_TIME_NO_SIEGE(19),
    MY_GRANNY_COULD_SCRAP_BETTER_THAN_THAT(20),
    NICE_TOWN_ILL_TAKE_IT(21),
    QUIT_TOUCHING_ME(22),
    RAIDING_PARTY(23),
    DADGUM(24),
    EH_SMITE_ME(25),
    THE_WONDER_THE_WONDER_THE_NO(26),
    YOU_PLAYED_TWO_HOURS_TO_DIE_LIKE_THIS(27),
    YEAH_WELL_YOU_SHOULD_SEE_THE_OTHER_GUY(28),
    ROGGAN(29),
    WOLOLO(30),
    ATTACK_AN_ENEMY_NOW(31),
    CEASE_CREATING_EXTRA_VILLAGERS(32),
    CREATE_EXTRA_VILLAGERS(33),
    BUILD_A_NAVY(34),
    STOP_BUILDING_A_NAVY(35),
    WAIT_FOR_MY_SIGNAL_TO_ATTACK(36),
    BUILD_A_WONDER(37),
    GIVE_ME_YOUR_EXTRA_RESOURCES(38),
    ALLY_SOUND(39),
    ENEMY_SOUND(40),
    NEUTRAL_SOUND(41),
    WHAT_AGE_ARE_YOU_IN(42);

    private final int value;

    private TauntId(int value) {
        this.value = value;
    }

    @Override
    public String value() {
        return Integer.toString(value);
    }
}
