package com.etherblood.aoe2.ai.core.variables.strategicnumbers;

import com.etherblood.aoe2.ai.core.variables.Toggle;
import com.etherblood.aoe2.ai.core.variables.parameters.buildings.Buildings;

/**
 *
 * @author Philipp
 */
public class StrategicNumbers {

    public final static StrategicNumber<Integer> PERCENT_CIVILIAN_EXPLORERS = new StrategicNumber<>(0, "sn-percent-civilian-explorers");
    public final static StrategicNumber<Integer> PERCENT_CIVILIAN_BUILDERS = new StrategicNumber<>(1, "sn-percent-civilian-builders");
    public final static StrategicNumber<Integer> PERCENT_CIVILIAN_GATHERERS = new StrategicNumber<>(2, "sn-percent-civilian-gatherers");
    public final static StrategicNumber<Integer> CAP_CIVILIAN_EXPLORERS = new StrategicNumber<>(3, "sn-cap-civilian-explorers");
    public final static StrategicNumber<Integer> CAP_CIVILIAN_BUILDERS = new StrategicNumber<>(4, "sn-cap-civilian-builders");
    public final static StrategicNumber<Integer> CAP_CIVILIAN_GATHERERS = new StrategicNumber<>(5, "sn-cap-civilian-gatherers");
    public final static StrategicNumber<Integer> MINIMUM_ATTACK_GROUP_SIZE = new StrategicNumber<>(16, "sn-minimum-attack-group-size");
    public final static StrategicNumber<Integer> TOTAL_NUMBER_EXPLORERS = new StrategicNumber<>(18, "sn-total-number-explorers");
    public final static StrategicNumber<Integer> PERCENT_ENEMY_SIGHTED_RESPONSE = new StrategicNumber<>(19, "sn-percent-enemy-sighted-response");
    public final static StrategicNumber<Integer> ENEMY_SIGHTED_RESPONSE_DISTANCE = new StrategicNumber<>(20, "sn-enemy-sighted-response-distance");
    public final static StrategicNumber<Integer> SENTRY_DISTANCE = new StrategicNumber<>(22, "sn-sentry-distance");
    public final static StrategicNumber<Integer> RELIC_RETURN_DISTANCE = new StrategicNumber<>(23, "sn-relic-return-distance");
    public final static StrategicNumber<Integer> PERCENT_VICTORY_CLAMP = new StrategicNumber<>(24, "sn-percent-victory-clamp");
    public final static StrategicNumber<Integer> MINIMUM_DEFEND_GROUP_SIZE = new StrategicNumber<>(25, "sn-minimum-defend-group-size");
    public final static StrategicNumber<Integer> MAXIMUM_ATTACK_GROUP_SIZE = new StrategicNumber<>(26, "sn-maximum-attack-group-size");
    public final static StrategicNumber<Integer> MAXIMUM_DEFEND_GROUP_SIZE = new StrategicNumber<>(28, "sn-maximum-defend-group-size");
    public final static StrategicNumber<Integer> MINIMUM_PEACE_LIKE_LEVEL = new StrategicNumber<>(29, "sn-minimum-peace-like-level");
    public final static StrategicNumber<Integer> PERCENT_HEALTH_RETREAT = new StrategicNumber<>(30, "sn-percent-health-retreat");
    public final static StrategicNumber<Integer> PERCENT_DEATH_RETREAT = new StrategicNumber<>(31, "sn-percent-death-retreat");
    public final static StrategicNumber<Integer> PERCENT_EXPLORATION_REQUIRED = new StrategicNumber<>(32, "sn-percent-exploration-required");
    public final static StrategicNumber<Integer> ZERO_PRIORITY_DISTANCE = new StrategicNumber<>(34, "sn-zero-priority-distance");
    public final static StrategicNumber<Integer> MINIMUM_CIVILIAN_EXPLORERS = new StrategicNumber<>(35, "sn-minimum-civilian-explorers");
    public final static StrategicNumber<Integer> NUMBER_ATTACK_GROUPS = new StrategicNumber<>(36, "sn-number-attack-groups");
    public final static StrategicNumber ATTACK_GROUP_MAKEUP = new StrategicNumber<>(37, "sn-attack-group-makeup");
    public final static StrategicNumber<Integer> NUMBER_DEFEND_GROUPS = new StrategicNumber<>(38, "sn-number-defend-groups");
    public final static StrategicNumber DEFEND_GROUP_MAKEUP = new StrategicNumber<>(39, "sn-defend-group-makeup");
    public final static StrategicNumber GROUP_FILL_METHOD = new StrategicNumber<>(40, "sn-group-fill-method");
    public final static StrategicNumber ATTACK_GROUP_GATHER_SPACING = new StrategicNumber<>(41, "sn-attack-group-gather-spacing");
    public final static StrategicNumber<Integer> NUMBER_EXPLORE_GROUPS = new StrategicNumber<>(42, "sn-number-explore-groups");
    public final static StrategicNumber<Integer> MINIMUM_EXPLORE_GROUP_SIZE = new StrategicNumber<>(43, "sn-minimum-explore-group-size");
    public final static StrategicNumber<Integer> MAXIMUM_EXPLORE_GROUP_SIZE = new StrategicNumber<>(44, "sn-maximum-explore-group-size");
    public final static StrategicNumber EXPLORE_GROUP_MAKEUP = new StrategicNumber<>(45, "sn-explore-group-makeup");
    public final static StrategicNumber ATTACK_SEPARATION_TIME = new StrategicNumber<>(46, "sn-attack-separation-time");
    public final static StrategicNumber ATTACK_COORDINATION = new StrategicNumber<>(47, "sn-attack-coordination");
    public final static StrategicNumber ATTACK_RESPONSE_SEPARATION_TIME = new StrategicNumber<>(48, "sn-attack-response-separation-time");
    public final static StrategicNumber RETREAT_AFTER_TARGET_DESTROYED = new StrategicNumber<>(49, "sn-retreat-after-target-destroyed");
    public final static StrategicNumber GOLD_DEFEND_PRIORITY = new StrategicNumber<>(50, "sn-gold-defend-priority");
    public final static StrategicNumber STONE_DEFEND_PRIORITY = new StrategicNumber<>(51, "sn-stone-defend-priority");
    public final static StrategicNumber FORAGE_DEFEND_PRIORITY = new StrategicNumber<>(52, "sn-forage-defend-priority");
    public final static StrategicNumber CHOKE_POINT_DEFEND_PRIORITY = new StrategicNumber<>(53, "sn-choke-point-defend-priority");
    public final static StrategicNumber RUINS_DEFEND_PRIORITY = new StrategicNumber<>(54, "sn-ruins-defend-priority");
    public final static StrategicNumber RELIC_DEFEND_PRIORITY = new StrategicNumber<>(55, "sn-relic-defend-priority");
    public final static StrategicNumber TOWN_DEFEND_PRIORITY = new StrategicNumber<>(56, "sn-town-defend-priority");
    public final static StrategicNumber<Integer> DEFENSE_DISTANCE = new StrategicNumber<>(57, "sn-defense-distance");
    public final static StrategicNumber<Integer> NUMBER_BOAT_ATTACK_GROUPS = new StrategicNumber<>(58, "sn-number-boat-attack-groups");
    public final static StrategicNumber<Integer> MINIMUM_BOAT_ATTACK_GROUP_SIZE = new StrategicNumber<>(59, "sn-minimum-boat-attack-group-size");
    public final static StrategicNumber<Integer> MAXIMUM_BOAT_ATTACK_GROUP_SIZE = new StrategicNumber<>(60, "sn-maximum-boat-attack-group-size");
    public final static StrategicNumber<Integer> NUMBER_BOAT_EXPLORE_GROUPS = new StrategicNumber<>(61, "sn-number-boat-explore-groups");
    public final static StrategicNumber<Integer> MINIMUM_BOAT_EXPLORE_GROUP_SIZE = new StrategicNumber<>(62, "sn-minimum-boat-explore-group-size");
    public final static StrategicNumber<Integer> MAXIMUM_BOAT_EXPLORE_GROUP_SIZE = new StrategicNumber<>(63, "sn-maximum-boat-explore-group-size");
    public final static StrategicNumber<Integer> DESIRED_NUMBER_TRADE_ESCORTS = new StrategicNumber<>(64, "sn-desired-number-trade-escorts");
    public final static StrategicNumber<Integer> DESIRED_NUMBER_FISH_ESCORTS = new StrategicNumber<>(65, "sn-desired-number-fish-escorts");
    public final static StrategicNumber<Integer> DESIRED_NUMBER_TRANSPORT_ESCORTS = new StrategicNumber<>(66, "sn-desired-number-transport-escorts");
    public final static StrategicNumber<Integer> NUMBER_BOAT_DEFEND_GROUPS = new StrategicNumber<>(67, "sn-number-boat-defend-groups");
    public final static StrategicNumber<Integer> MINIMUM_BOAT_DEFEND_GROUP_SIZE = new StrategicNumber<>(68, "sn-minimum-boat-defend-group-size");
    public final static StrategicNumber<Integer> MAXIMUM_BOAT_DEFEND_GROUP_SIZE = new StrategicNumber<>(69, "sn-maximum-boat-defend-group-size");
    public final static StrategicNumber DOCK_DEFEND_PRIORITY = new StrategicNumber<>(70, "sn-dock-defend-priority");
    public final static StrategicNumber LOCK_ATTACK_AND_ATTACK_RESPONSE = new StrategicNumber<>(71, "sn-lock-attack-and-attack-response");
    public final static StrategicNumber SENTRY_DISTANCE_VARIATION = new StrategicNumber<>(72, "sn-sentry-distance-variation");
    public final static StrategicNumber<Integer> MINIMUM_TOWN_SIZE = new StrategicNumber<>(73, "sn-minimum-town-size");
    public final static StrategicNumber<Integer> MAXIMUM_TOWN_SIZE = new StrategicNumber<>(74, "sn-maximum-town-size");
    public final static StrategicNumber GROUP_COMMANDER_SELECTION_METHOD = new StrategicNumber<>(75, "sn-group-commander-selection-method");
    public final static StrategicNumber CONSECUTIVE_IDLE_UNIT_LIMIT = new StrategicNumber<>(76, "sn-consecutive-idle-unit-limit");
    public final static StrategicNumber<Integer> TARGET_EVALUATION_DISTANCE = new StrategicNumber<>(77, "sn-target-evaluation-distance");
    public final static StrategicNumber TARGET_EVALUATION_HITPOINTS = new StrategicNumber<>(78, "sn-target-evaluation-hitpoints");
    public final static StrategicNumber TARGET_EVALUATION_DAMAGE_CAPABILITY = new StrategicNumber<>(79, "sn-target-evaluation-damage-capability");
    public final static StrategicNumber TARGET_EVALUATION_KILLS = new StrategicNumber<>(80, "sn-target-evaluation-kills");
    public final static StrategicNumber TARGET_EVALUATION_ALLY_PROXIMITY = new StrategicNumber<>(81, "sn-target-evaluation-ally-proximity");
    public final static StrategicNumber TARGET_EVALUATION_ROF = new StrategicNumber<>(82, "sn-target-evaluation-rof");
    public final static StrategicNumber TARGET_EVALUATION_RANDOMNESS = new StrategicNumber<>(83, "sn-target-evaluation-randomness");
    public final static StrategicNumber<Integer> NUMBER_WALL_GATES = new StrategicNumber<>(84, "sn-number-wall-gates");
    public final static StrategicNumber<Integer> SIZE_WALL_GATES = new StrategicNumber<>(85, "sn-size-wall-gates");
    public final static StrategicNumber<Integer> CAMP_MAX_DISTANCE = new StrategicNumber<>(86, "sn-camp-max-distance");
    public final static StrategicNumber<Integer> MILL_MAX_DISTANCE = new StrategicNumber<>(87, "sn-mill-max-distance");
    public final static StrategicNumber TACTICAL_UPDATE_FREQUENCY = new StrategicNumber<>(88, "sn-tactical-update-frequency");
    public final static StrategicNumber TARGET_EVALUATION_ATTACK_ATTEMPTS = new StrategicNumber<>(89, "sn-target-evaluation-attack-attempts");
    public final static StrategicNumber TARGET_EVALUATION_RANGE = new StrategicNumber<>(90, "sn-target-evaluation-range");
    public final static StrategicNumber<Integer> PERCENT_UNIT_HEALTH_RETREAT = new StrategicNumber<>(91, "sn-percent-unit-health-retreat");
    public final static StrategicNumber DEFEND_OVERLAP_DISTANCE = new StrategicNumber<>(92, "sn-defend-overlap-distance");
    public final static StrategicNumber<Integer> SCALE_MINIMUM_ATTACK_GROUP_SIZE = new StrategicNumber<>(93, "sn-scale-minimum-attack-group-size");
    public final static StrategicNumber<Integer> SCALE_MAXIMUM_ATTACK_GROUP_SIZE = new StrategicNumber<>(94, "sn-scale-maximum-attack-group-size");
    public final static StrategicNumber SCALE_PERCENT_HEALTH_RETREAT = new StrategicNumber<>(95, "sn-scale-percent-health-retreat");
    public final static StrategicNumber SCALE_PERCENT_DEATH_RETREAT = new StrategicNumber<>(96, "sn-scale-percent-death-retreat");
    public final static StrategicNumber SCALE_PERCENT_UNIT_HEALTH_RETREAT = new StrategicNumber<>(97, "sn-scale-percent-unit-health-retreat");
    public final static StrategicNumber ATTACK_GROUP_SIZE_RANDOMNESS = new StrategicNumber<>(98, "sn-attack-group-size-randomness");
    public final static StrategicNumber SCALING_FREQUENCY = new StrategicNumber<>(99, "sn-scaling-frequency");
    public final static StrategicNumber MAXIMUM_GAIA_ATTACK_RESPONSE = new StrategicNumber<>(100, "sn-maximum-gaia-attack-response");
    public final static StrategicNumber BUILD_FREQUENCY = new StrategicNumber<>(101, "sn-build-frequency");
    public final static StrategicNumber ATTACK_SEPARATION_TIME_RANDOMNESS = new StrategicNumber<>(102, "sn-attack-separation-time-randomness");
    public final static StrategicNumber<Toggle> ATTACK_INTELLIGENCE = new StrategicNumber<>(103, "sn-attack-intelligence");
    public final static StrategicNumber INITIAL_ATTACK_DELAY = new StrategicNumber<>(104, "sn-initial-attack-delay");
    public final static StrategicNumber SAVE_SCENARIO_INFORMATION = new StrategicNumber<>(105, "sn-save-scenario-information");
    public final static StrategicNumber SPECIAL_ATTACK_TYPE1 = new StrategicNumber<>(106, "sn-special-attack-type1");
    public final static StrategicNumber SPECIAL_ATTACK_TYPE2 = new StrategicNumber<>(107, "sn-special-attack-type2");
    public final static StrategicNumber SPECIAL_ATTACK_TYPE3 = new StrategicNumber<>(108, "sn-special-attack-type3");
    public final static StrategicNumber SPECIAL_ATTACK_INFLUENCE1 = new StrategicNumber<>(109, "sn-special-attack-influence1");
    public final static StrategicNumber SPECIAL_ATTACK_INFLUENCE2 = new StrategicNumber<>(110, "sn-special-attack-influence2");
    public final static StrategicNumber SPECIAL_ATTACK_INFLUENCE3 = new StrategicNumber<>(111, "sn-special-attack-influence3");
    public final static StrategicNumber MINIMUM_WATER_BODY_SIZE_FOR_DOCK = new StrategicNumber<>(112, "sn-minimum-water-body-size-for-dock");
    public final static StrategicNumber<Integer> NUMBER_BUILD_ATTEMPTS_BEFORE_SKIP = new StrategicNumber<>(114, "sn-number-build-attempts-before-skip");
    public final static StrategicNumber MAX_SKIPS_PER_ATTEMPT = new StrategicNumber<>(115, "sn-max-skips-per-attempt");
    public final static StrategicNumber<Integer> FOOD_GATHERER_PERCENTAGE = new StrategicNumber<>(117, "sn-food-gatherer-percentage");
    public final static StrategicNumber<Integer> GOLD_GATHERER_PERCENTAGE = new StrategicNumber<>(118, "sn-gold-gatherer-percentage");
    public final static StrategicNumber<Integer> STONE_GATHERER_PERCENTAGE = new StrategicNumber<>(119, "sn-stone-gatherer-percentage");
    public final static StrategicNumber<Integer> WOOD_GATHERER_PERCENTAGE = new StrategicNumber<>(120, "sn-wood-gatherer-percentage");
    public final static StrategicNumber DEFEND_IMPORTANT_GROUP_LEADERS = new StrategicNumber<>(121, "sn-defend-important-group-leaders");
    public final static StrategicNumber TARGET_EVALUATION_CONTINENT = new StrategicNumber<>(122, "sn-target-evaluation-continent");
    public final static StrategicNumber TARGET_EVALUATION_SIEGE_WEAPON = new StrategicNumber<>(123, "sn-target-evaluation-siege-weapon");
    public final static StrategicNumber<Integer> TRIBUTE_AMOUNT = new StrategicNumber<>(124, "sn-tribute-amount");
    public final static StrategicNumber TRIBUTE_CHAT_FREQUENCY = new StrategicNumber<>(125, "sn-tribute-chat-frequency");
    public final static StrategicNumber TRIBUTE_CHAT_RANDOMNESS = new StrategicNumber<>(126, "sn-tribute-chat-randomness");
    public final static StrategicNumber TRIBUTE_TIMEOUT = new StrategicNumber<>(127, "sn-tribute-timeout");
    public final static StrategicNumber TRIBUTE_PLAYER = new StrategicNumber<>(128, "sn-tribute-player");
    public final static StrategicNumber TRIBUTE_SUCCESS_OUTCOME = new StrategicNumber<>(129, "sn-tribute-success-outcome");
    public final static StrategicNumber TRIBUTE_FAILURE_OUTCOME = new StrategicNumber<>(130, "sn-tribute-failure-outcome");
    public final static StrategicNumber<Integer> GROUP_LEADER_DEFENSE_DISTANCE = new StrategicNumber<>(131, "sn-group-leader-defense-distance");
    public final static StrategicNumber TRIBUTE_PERSISTENCE = new StrategicNumber<>(132, "sn-tribute-persistence");
    public final static StrategicNumber TRIBUTE_REVOKE_ON_ATTACK = new StrategicNumber<>(133, "sn-tribute-revoke-on-attack");
    public final static StrategicNumber INITIAL_ATTACK_DELAY_TYPE = new StrategicNumber<>(134, "sn-initial-attack-delay-type");
    public final static StrategicNumber BLOT_EXPLORATION_MAP = new StrategicNumber<>(135, "sn-blot-exploration-map");
    public final static StrategicNumber<Integer> BLOT_SIZE = new StrategicNumber<>(136, "sn-blot-size");
    public final static StrategicNumber ADD_STARTING_RESOURCE_FOOD = new StrategicNumber<>(138, "sn-add-starting-resource-food");
    public final static StrategicNumber ADD_STARTING_RESOURCE_GOLD = new StrategicNumber<>(139, "sn-add-starting-resource-gold");
    public final static StrategicNumber ADD_STARTING_RESOURCE_STONE = new StrategicNumber<>(140, "sn-add-starting-resource-stone");
    public final static StrategicNumber ADD_STARTING_RESOURCE_WOOD = new StrategicNumber<>(141, "sn-add-starting-resource-wood");
    public final static StrategicNumber<Toggle> INTELLIGENT_GATHERING = new StrategicNumber<>(142, "sn-intelligent-gathering");
    public final static StrategicNumber TASK_UNGROUPED_SOLDIERS = new StrategicNumber<>(143, "sn-task-ungrouped-soldiers");
    public final static StrategicNumber TARGET_EVALUATION_BOAT = new StrategicNumber<>(144, "sn-target-evaluation-boat");
    public final static StrategicNumber<Integer> NUMBER_ENEMY_OBJECTS_REQUIRED = new StrategicNumber<>(145, "sn-number-enemy-objects-required");
    public final static StrategicNumber<Integer> NUMBER_MAX_SKIP_CYCLES = new StrategicNumber<>(146, "sn-number-max-skip-cycles");
    public final static StrategicNumber MOST_NEEDED_RESOURCE_LOOK_AHEAD = new StrategicNumber<>(147, "sn-most-needed-resource-look-ahead");
    public final static StrategicNumber<Integer> RETASK_GATHER_AMOUNT = new StrategicNumber<>(148, "sn-retask-gather-amount");
    public final static StrategicNumber<Integer> MAX_RETASK_GATHER_AMOUNT = new StrategicNumber<>(149, "sn-max-retask-gather-amount");
    public final static StrategicNumber MAX_STORAGE_PITS = new StrategicNumber<>(150, "sn-max-storage-pits");
    public final static StrategicNumber MAX_GRANARIES = new StrategicNumber<>(151, "sn-max-granaries");
    public final static StrategicNumber HOUSE_OVERAGE = new StrategicNumber<>(152, "sn-house-overage");
    public final static StrategicNumber BUILD_PLAN_DIVISIONS = new StrategicNumber<>(155, "sn-build-plan-divisions");
    public final static StrategicNumber<Integer> FOOD_MODIFIER_PERCENTAGE = new StrategicNumber<>(156, "sn-food-modifier-percentage");
    public final static StrategicNumber<Integer> WOOD_MODIFIER_PERCENTAGE = new StrategicNumber<>(157, "sn-wood-modifier-percentage");
    public final static StrategicNumber<Integer> STONE_MODIFIER_PERCENTAGE = new StrategicNumber<>(158, "sn-stone-modifier-percentage");
    public final static StrategicNumber<Integer> GOLD_MODIFIER_PERCENTAGE = new StrategicNumber<>(159, "sn-gold-modifier-percentage");
    public final static StrategicNumber<Integer> MAX_BUILD_PLAN_GATHERER_PERCENTAGE = new StrategicNumber<>(160, "sn-max-build-plan-gatherer-percentage");
    public final static StrategicNumber<Buildings> REQUIRED_FIRST_BUILDING = new StrategicNumber<>(161, "sn-required-first-building");
    public final static StrategicNumber<Integer> FOOD_DROPSITE_DISTANCE = new StrategicNumber<>(163, "sn-food-dropsite-distance");
    public final static StrategicNumber<Integer> WOOD_DROPSITE_DISTANCE = new StrategicNumber<>(164, "sn-wood-dropsite-distance");
    public final static StrategicNumber<Integer> STONE_DROPSITE_DISTANCE = new StrategicNumber<>(165, "sn-stone-dropsite-distance");
    public final static StrategicNumber<Integer> GOLD_DROPSITE_DISTANCE = new StrategicNumber<>(166, "sn-gold-dropsite-distance");
    public final static StrategicNumber<Toggle> INITIAL_EXPLORATION_REQUIRED = new StrategicNumber<>(167, "sn-initial-exploration-required");
    public final static StrategicNumber RANDOM_PLACEMENT_FACTOR = new StrategicNumber<>(168, "sn-random-placement-factor");
    public final static StrategicNumber REQUIRED_FOREST_TILES = new StrategicNumber<>(169, "sn-required-forest-tiles");
    public final static StrategicNumber<Integer> MINIMUM_FOOD = new StrategicNumber<>(170, "sn-minimum-food");
    public final static StrategicNumber<Integer> MINIMUM_WOOD = new StrategicNumber<>(171, "sn-minimum-wood");
    public final static StrategicNumber<Integer> MINIMUM_STONE = new StrategicNumber<>(172, "sn-minimum-stone");
    public final static StrategicNumber<Integer> MINIMUM_GOLD = new StrategicNumber<>(173, "sn-minimum-gold");
    public final static StrategicNumber MAXIMUM_HOUSES_BEFORE_DROPSITES = new StrategicNumber<>(174, "sn-maximum-houses-before-dropsites");
    public final static StrategicNumber SPECIFIC_BUILD_ITEM_TO_BUILD = new StrategicNumber<>(175, "sn-specific-build-item-to-build");
    public final static StrategicNumber SPECIFIC_BUILD_ITEM_TIME = new StrategicNumber<>(176, "sn-specific-build-item-time");
    public final static StrategicNumber UNSKIPPABLE_ITEM_TYPE = new StrategicNumber<>(177, "sn-unskippable-item-type");
    public final static StrategicNumber ATTACK_DIPLOMACY_IMPACT = new StrategicNumber<>(178, "sn-attack-diplomacy-impact");
    public final static StrategicNumber<Integer> PERCENT_HALF_EXPLORATION = new StrategicNumber<>(179, "sn-percent-half-exploration");
    public final static StrategicNumber<Toggle> AUTO_BUILD_HOUSES = new StrategicNumber<>(180, "sn-auto-build-houses");
    public final static StrategicNumber UPGRADE_TO_TOOL_AGE_ASAP = new StrategicNumber<>(181, "sn-upgrade-to-tool-age-asap");
    public final static StrategicNumber UPGRADE_TO_BRONZE_AGE_ASAP = new StrategicNumber<>(182, "sn-upgrade-to-bronze-age-asap");
    public final static StrategicNumber UPGRADE_TO_IRON_AGE_ASAP = new StrategicNumber<>(183, "sn-upgrade-to-iron-age-asap");
    public final static StrategicNumber TARGET_EVALUATION_TIME_KILL_RATIO = new StrategicNumber<>(184, "sn-target-evaluation-time-kill-ratio");
    public final static StrategicNumber TARGET_EVALUATION_IN_PROGRESS = new StrategicNumber<>(185, "sn-target-evaluation-in-progress");
    public final static StrategicNumber COOP_DEMAND_TRIBUTE_INTERVAL = new StrategicNumber<>(186, "sn-coop-demand-tribute-interval");
    public final static StrategicNumber COOP_DEMAND_TRIBUTE_MAXIMUM = new StrategicNumber<>(187, "sn-coop-demand-tribute-maximum");
    public final static StrategicNumber ATTACK_WINNING_PLAYER = new StrategicNumber<>(188, "sn-attack-winning-player");
    public final static StrategicNumber<Integer> MAXIMUM_FOOD = new StrategicNumber<>(190, "sn-maximum-food");
    public final static StrategicNumber<Integer> MAXIMUM_WOOD = new StrategicNumber<>(191, "sn-maximum-wood");
    public final static StrategicNumber<Integer> MAXIMUM_STONE = new StrategicNumber<>(192, "sn-maximum-stone");
    public final static StrategicNumber<Integer> MAXIMUM_GOLD = new StrategicNumber<>(193, "sn-maximum-gold");
    public final static StrategicNumber<Toggle> COOP_SHARE_INFORMATION = new StrategicNumber<>(194, "sn-coop-share-information");
    public final static StrategicNumber ATTACK_WINNING_PLAYER_FACTOR = new StrategicNumber<>(195, "sn-attack-winning-player-factor");
    public final static StrategicNumber<Toggle> COOP_SHARE_ATTACKING = new StrategicNumber<>(196, "sn-coop-share-attacking");
    public final static StrategicNumber COOP_SHARE_ATTACKING_INTERVAL = new StrategicNumber<>(197, "sn-coop-share-attacking-interval");
    public final static StrategicNumber<Integer> PERCENTAGE_EXPLORE_EXTERMINATORS = new StrategicNumber<>(198, "sn-percentage-explore-exterminators");
    public final static StrategicNumber TRACK_PLAYER_HISTORY = new StrategicNumber<>(201, "sn-track-player-history");
    public final static StrategicNumber MINIMUM_DROPSITE_BUFFER = new StrategicNumber<>(202, "sn-minimum-dropsite-buffer");
    public final static StrategicNumber USE_BY_TYPE_MAX_GATHERING = new StrategicNumber<>(203, "sn-use-by-type-max-gathering");
    public final static StrategicNumber MINIMUM_BOAR_HUNT_GROUP_SIZE = new StrategicNumber<>(204, "sn-minimum-boar-hunt-group-size");
//    public final static StrategicNumber<Toggle> AUTO_BUILD_DROPSITES = new StrategicNumber<>(205, "sn-auto-build-dropsites");
    public final static StrategicNumber<Toggle> AUTO_BUILD_FARMS = new StrategicNumber<>(206, "sn-auto-build-farms");
    public final static StrategicNumber<Toggle> AUTO_BUILD_TOWERS = new StrategicNumber<>(207, "sn-auto-build-towers");
    public final static StrategicNumber<Toggle> AUTO_BUILD_DOCKS = new StrategicNumber<>(208, "sn-auto-build-docks");
    public final static StrategicNumber<Toggle> AUTO_BUILD_FISHING_BOATS = new StrategicNumber<>(209, "sn-auto-build-fishing-boats");
    public final static StrategicNumber<Toggle> AUTO_BUILD_TRANSPORTS = new StrategicNumber<>(210, "sn-auto-build-transports");
    public final static StrategicNumber<Integer> DESIRED_NUMBER_DOCKS = new StrategicNumber<>(212, "sn-desired-number-docks");
    public final static StrategicNumber<Integer> DESIRED_NUMBER_FISHING_BOATS = new StrategicNumber<>(213, "sn-desired-number-fishing-boats");
    public final static StrategicNumber<Integer> DESIRED_NUMBER_TRANSPORTS = new StrategicNumber<>(214, "sn-desired-number-transports");
    public final static StrategicNumber<Toggle> ALLOW_DIPLOMACY_CHANGE_ON_ALLY_ATTACK = new StrategicNumber<>(215, "sn-allow-diplomacy-change-on-ally-attack");
    public final static StrategicNumber<Integer> MINIMUM_AMOUNT_FOR_TRADING = new StrategicNumber<>(216, "sn-minimum-amount-for-trading");
    public final static StrategicNumber<Toggle> ALLOW_DIPLOMACY_CHANGE_ON_TRIBUTE = new StrategicNumber<>(217, "sn-allow-diplomacy-change-on-tribute");
    public final static StrategicNumber<Integer> EASIEST_REACTION_PERCENTAGE = new StrategicNumber<>(218, "sn-easiest-reaction-percentage");
    public final static StrategicNumber<Integer> EASIER_REACTION_PERCENTAGE = new StrategicNumber<>(219, "sn-easier-reaction-percentage");
    public final static StrategicNumber<Integer> MAX_FARMS = new StrategicNumber<>(220, "sn-max-farms");
    public final static StrategicNumber HITS_BEFORE_ALLIANCE_CHANGE = new StrategicNumber<>(221, "sn-hits-before-alliance-change");
    public final static StrategicNumber<Integer> MAX_TOWERS = new StrategicNumber<>(222, "sn-max-towers");
    public final static StrategicNumber<Toggle> AUTO_BUILD_WARSHIPS = new StrategicNumber<>(223, "sn-auto-build-warships");
    public final static StrategicNumber<Integer> DESIRED_NUMBER_WARSHIPS = new StrategicNumber<>(224, "sn-desired-number-warships");
    public final static StrategicNumber<Toggle> ALLOW_CIVILIAN_DEFENSE = new StrategicNumber<>(225, "sn-allow-civilian-defense");
    public final static StrategicNumber<Integer> NUMBER_FORWARD_BUILDERS = new StrategicNumber<>(226, "sn-number-forward-builders");
    public final static StrategicNumber<Integer> PERCENT_ATTACK_SOLDIERS = new StrategicNumber<>(227, "sn-percent-attack-soldiers");
    public final static StrategicNumber<Integer> PERCENT_ATTACK_BOATS = new StrategicNumber<>(228, "sn-percent-attack-boats");
    public final static StrategicNumber DO_NOT_SCALE_FOR_DIFFICULTY_LEVEL = new StrategicNumber<>(229, "sn-do-not-scale-for-difficulty-level");
    public final static StrategicNumber<Integer> GROUP_FORM_DISTANCE = new StrategicNumber<>(230, "sn-group-form-distance");
    public final static StrategicNumber IGNORE_ATTACK_GROUP_UNDER_ATTACK = new StrategicNumber<>(231, "sn-ignore-attack-group-under-attack");
    public final static StrategicNumber GATHER_DEFENSE_UNITS = new StrategicNumber<>(232, "sn-gather-defense-units");
    public final static StrategicNumber<Integer> MAXIMUM_WOOD_DROP_DISTANCE = new StrategicNumber<>(233, "sn-maximum-wood-drop-distance");
    public final static StrategicNumber<Integer> MAXIMUM_FOOD_DROP_DISTANCE = new StrategicNumber<>(234, "sn-maximum-food-drop-distance");
    public final static StrategicNumber<Integer> MAXIMUM_HUNT_DROP_DISTANCE = new StrategicNumber<>(235, "sn-maximum-hunt-drop-distance");
    public final static StrategicNumber<Integer> MAXIMUM_FISH_BOAT_DROP_DISTANCE = new StrategicNumber<>(236, "sn-maximum-fish-boat-drop-distance");
    public final static StrategicNumber<Integer> MAXIMUM_GOLD_DROP_DISTANCE = new StrategicNumber<>(237, "sn-maximum-gold-drop-distance");
    public final static StrategicNumber<Integer> MAXIMUM_STONE_DROP_DISTANCE = new StrategicNumber<>(238, "sn-maximum-stone-drop-distance");
    public final static StrategicNumber<Toggle> GATHER_IDLE_SOLDIERS_AT_CENTER = new StrategicNumber<>(239, "sn-gather-idle-soldiers-at-center");
    public final static StrategicNumber<Toggle> GARRISON_RAMS = new StrategicNumber<>(240, "sn-garrison-rams");
    public final static StrategicNumber DO_NOT_TRANSPORT_FROM_SAME_ZONE = new StrategicNumber<>(241, "sn-do-not-transport-from-same-zone");
    public final static StrategicNumber<Toggle> ENABLE_NEW_BUILDING_SYSTEM = new StrategicNumber<>(242, "sn-enable-new-building-system");
    public final static StrategicNumber<Integer> PERCENT_BUILDING_CANCELLATION = new StrategicNumber<>(243, "sn-percent-building-cancellation");
    public final static StrategicNumber ENABLE_BOAR_HUNTING = new StrategicNumber<>(244, "sn-enable-boar-hunting");
    public final static StrategicNumber<Integer> MINIMUM_NUMBER_HUNTERS = new StrategicNumber<>(245, "sn-minimum-number-hunters");
    public final static StrategicNumber OBJECT_REPAIR_LEVEL = new StrategicNumber<>(246, "sn-object-repair-level");
    public final static StrategicNumber ENABLE_PATROL_ATTACK = new StrategicNumber<>(247, "sn-enable-patrol-attack");
    public final static StrategicNumber DROPSITE_SEPARATION_DISTANCE = new StrategicNumber<>(248, "sn-dropsite-separation-distance");
    public final static StrategicNumber TARGET_PLAYER_NUMBER = new StrategicNumber<>(249, "sn-target-player-number");
    public final static StrategicNumber<Integer> SAFE_TOWN_SIZE = new StrategicNumber<>(250, "sn-safe-town-size");
    public final static StrategicNumber FOCUS_PLAYER_NUMBER = new StrategicNumber<>(251, "sn-focus-player-number");
    public final static StrategicNumber<Integer> MINIMUM_BOAR_LURE_GROUP_SIZE = new StrategicNumber<>(252, "sn-minimum-boar-lure-group-size");
    public final static StrategicNumber PREFERRED_MILL_PLACEMENT = new StrategicNumber<>(253, "sn-preferred-mill-placement");
    public final static StrategicNumber ENABLE_OFFENSIVE_PRIORITY = new StrategicNumber<>(254, "sn-enable-offensive-priority");
    public final static StrategicNumber BUILDING_TARGETING_MODE = new StrategicNumber<>(255, "sn-building-targeting-mode");
    public final static StrategicNumber HOME_EXPLORATION_TIME = new StrategicNumber<>(256, "sn-home-exploration-time");
    public final static StrategicNumber<Integer> NUMBER_CIVILIAN_MILITIA = new StrategicNumber<>(257, "sn-number-civilian-militia");
    public final static StrategicNumber ALLOW_CIVILIAN_OFFENSE = new StrategicNumber<>(258, "sn-allow-civilian-offense");
    public final static StrategicNumber<Integer> PREFERRED_TRADE_DISTANCE = new StrategicNumber<>(259, "sn-preferred-trade-distance");
    public final static StrategicNumber<Integer> LUMBER_CAMP_MAX_DISTANCE = new StrategicNumber<>(260, "sn-lumber-camp-max-distance");
    public final static StrategicNumber<Integer> MINING_CAMP_MAX_DISTANCE = new StrategicNumber<>(261, "sn-mining-camp-max-distance");
    public final static StrategicNumber WALL_TARGETING_MODE = new StrategicNumber<>(262, "sn-wall-targeting-mode");
    public final static StrategicNumber<Toggle> LIVESTOCK_TO_TOWN_CENTER = new StrategicNumber<>(263, "sn-livestock-to-town-center");
    public final static StrategicNumber ENABLE_TRAINING_QUEUE = new StrategicNumber<>(264, "sn-enable-training-queue");
    public final static StrategicNumber IGNORE_TOWER_ELEVATION = new StrategicNumber<>(265, "sn-ignore-tower-elevation");
    public final static StrategicNumber TOWN_CENTER_PLACEMENT = new StrategicNumber<>(266, "sn-town-center-placement");
    public final static StrategicNumber DISABLE_TOWER_PRIORITY = new StrategicNumber<>(267, "sn-disable-tower-priority");
    public final static StrategicNumber PLACEMENT_ZONE_SIZE = new StrategicNumber<>(268, "sn-placement-zone-size");
    public final static StrategicNumber PLACEMENT_FAIL_DELTA = new StrategicNumber<>(269, "sn-placement-fail-delta");
    public final static StrategicNumber PLACEMENT_TO_CENTER = new StrategicNumber<>(270, "sn-placement-to-center");
    public final static StrategicNumber DISABLE_ATTACK_GROUPS = new StrategicNumber<>(271, "sn-disable-attack-groups");
    public final static StrategicNumber<Toggle> ALLOW_ADJACENT_DROPSITES = new StrategicNumber<>(272, "sn-allow-adjacent-dropsites");
    public final static StrategicNumber DEFER_DROPSITE_UPDATE = new StrategicNumber<>(273, "sn-defer-dropsite-update");
    public final static StrategicNumber MAXIMUM_GARRISON_FILL = new StrategicNumber<>(274, "sn-maximum-garrison-fill");
    public final static StrategicNumber<Integer> NUMBER_GARRISON_UNITS = new StrategicNumber<>(275, "sn-number-garrison-units");
    public final static StrategicNumber FILTER_UNDER_ATTACK = new StrategicNumber<>(276, "sn-filter-under-attack");
    public final static StrategicNumber DISABLE_DEFEND_GROUPS = new StrategicNumber<>(277, "sn-disable-defend-groups");
    public final static StrategicNumber DOCK_PLACEMENT_MODE = new StrategicNumber<>(278, "sn-dock-placement-mode");
    public final static StrategicNumber DOCK_PROXIMITY_FACTOR = new StrategicNumber<>(279, "sn-dock-proximity-factor");
    public final static StrategicNumber DOCK_AVOIDANCE_FACTOR = new StrategicNumber<>(280, "sn-dock-avoidance-factor");
    public final static StrategicNumber DOCK_TRAINING_FILTER = new StrategicNumber<>(281, "sn-dock-training-filter");
    public final static StrategicNumber FREE_SIEGE_TARGETING = new StrategicNumber<>(282, "sn-free-siege-targeting");
    public final static StrategicNumber WARSHIP_TARGETING_MODE = new StrategicNumber<>(283, "sn-warship-targeting-mode");
    public final static StrategicNumber DISABLE_SIGHTED_RESPONSE_CAP = new StrategicNumber<>(284, "sn-disable-sighted-response-cap");
    public final static StrategicNumber DISABLE_BUILDER_ASSISTANCE = new StrategicNumber<>(285, "sn-disable-builder-assistance");
    public final static StrategicNumber LOCAL_TARGETING_MODE = new StrategicNumber<>(286, "sn-local-targeting-mode");
    public final static StrategicNumber LIVESTOCK_DEFEND_PRIORITY = new StrategicNumber<>(287, "sn-livestock-defend-priority");

}
