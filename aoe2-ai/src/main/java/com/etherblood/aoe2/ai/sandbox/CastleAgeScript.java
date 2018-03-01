package com.etherblood.aoe2.ai.sandbox;

import com.etherblood.aoe2.ai.core.script.JavaScript;
import com.etherblood.aoe2.ai.core.script.Rule;
import static com.etherblood.aoe2.ai.core.actions.Actions.*;
import static com.etherblood.aoe2.ai.core.variables.parameters.RelOp.*;
import static com.etherblood.aoe2.ai.core.facts.Facts.*;
import com.etherblood.aoe2.ai.core.variables.ResearchStatus;
import com.etherblood.aoe2.ai.core.variables.parameters.buildings.Buildings;
import com.etherblood.aoe2.ai.core.variables.parameters.Dropsite;
import com.etherblood.aoe2.ai.core.variables.parameters.RelOp;
import com.etherblood.aoe2.ai.core.variables.parameters.Resource;
import com.etherblood.aoe2.ai.core.variables.parameters.buildings.Building;
import com.etherblood.aoe2.ai.core.variables.parameters.researches.Research;
import com.etherblood.aoe2.ai.core.variables.parameters.researches.Researches;
import com.etherblood.aoe2.ai.core.variables.parameters.units.Unit;
import com.etherblood.aoe2.ai.core.variables.parameters.units.UnitLine;
import com.etherblood.aoe2.ai.core.variables.parameters.units.Units;
import static com.etherblood.aoe2.ai.core.variables.strategicnumbers.StrategicNumbers.*;

/**
 *
 * @author Philipp
 */
public class CastleAgeScript extends JavaScript {

    public CastleAgeScript() {
        super("castle age");

        rule("init")
                .when(
                        researchStatus(Researches.CASTLE_AGE, GREATER_OR_EQUAL, ResearchStatus.PENDING),
                        researchStatus(Researches.IMPERIAL_AGE, LESS_THAN, ResearchStatus.PENDING))
                .then(
                        setStrategicNumber(WOOD_GATHERER_PERCENTAGE, 40),
                        setStrategicNumber(FOOD_GATHERER_PERCENTAGE, 35),
                        setStrategicNumber(GOLD_GATHERER_PERCENTAGE, 20),
                        setStrategicNumber(STONE_GATHERER_PERCENTAGE, 5),
                        assignBuilders(Buildings.TOWN_CENTER_FOUNDATION, 5),
                        assignBuilders(Buildings.CASTLE, 5),
                        chatLocalToSelf("started castle-age script"),
                        disableSelf());
        rule("build stonecamp")
                .when(researchStatus(Researches.CASTLE_AGE, GREATER_OR_EQUAL, ResearchStatus.PENDING),
                        canBuild(Buildings.MINING_CAMP),
                        dropsiteMinDistance(Dropsite.STONE, RelOp.GREATER_THAN, 5),
                        resourceFound(Resource.STONE))
                .then(
                        build(Buildings.MINING_CAMP),
                        chatLocalToSelf("building stone-camp"));

        researchTech(Researches.HAND_CART);
        trainUnits(UnitLine.VILLAGER, 120);
        researchTech(Researches.BOW_SAW);
        researchTech(Researches.HEAVY_PLOW);
        researchTech(Researches.GOLD_MINING);
        researchTech(Researches.GOLD_SHAFT_MINING);
        buildBuildings(Buildings.TOWN_CENTER, 2);
        buildBuildings(Buildings.BLACKSMITH, 1);
        buildBuildings(Buildings.CASTLE, 10);
        buildBuildings(Buildings.MONASTERY, 1);
//        buildBuildings(SIEGE_WORKSHOP, 1);
        buildBuildings(Buildings.UNIVERSITY, 1);

//        buildBuildings(MINING_CAMP, 5).when(resourceFound(STONE),
//                dropsiteMinDistance(Dropsite.STONE, GREATER_THAN, 4));
//        buildBuildings(STABLE, 2);
        buildBuildings(Buildings.ARCHERY_RANGE, 3);
        buildBuildings(Buildings.BARRACKS, 1);
        buildBuildings(Buildings.TOWN_CENTER, 3);
        buildBuildings(Buildings.FARM, 30).when(woodAmount(GREATER_THAN, 250));
//        buildBuildings(FARM, 100).when(
//                or(
//                        woodAmount(GREATER_THAN, 250),
//                        foodAmount(LESS_THAN, 250)));

//        researchTech(FORGING);
//        researchTech(SCALE_MAIL);
//        researchTech(IRON_CASTING);
//        researchTech(CHAIN_MAIL);
//        researchTech(ELITE_SKIRMISHER);
//        researchTech(PIKEMAN);
//        researchTech(HUSBANDRY);
//        researchTech(SQUIRES);
        researchTech(Researches.CROSSBOW);
        researchTech(Researches.PADDED_ARCHER_ARMOR);
        researchTech(Researches.LEATHER_ARCHER_ARMOR);
        researchTech(Researches.FLETCHING);
        researchTech(Researches.BODKIN_ARROW);
        researchTech(Researches.THUMB_RING);
        researchTech(Researches.BALLISTICS);
        researchTech(Researches.MASONRY);
        researchTech(Researches.MURDER_HOLES);

        trainUnits(UnitLine.ARCHER_LINE, 100).when(foodAmount(GREATER_THAN, 150));
        trainUnits(UnitLine.PLUMED_ARCHER_LINE, 100).when(foodAmount(GREATER_THAN, 150));
//        trainUnits(SPEARMAN_LINE, 25).when(foodAmount(GREATER_THAN, 150));
//        trainUnits(CAMEL_LINE, 25).when(foodAmount(GREATER_THAN, 150));
        trainUnits(Unit.MONK, 2);
        trainUnits(UnitLine.BATTERING_RAM_LINE, 3);

        rule("attack")
                .when(
                        militaryPopulation(GREATER_OR_EQUAL, 40))
                .then(
                        attackNow(),
                        disableSelf());

        rule("build houses")
                .when(
                        researchStatus(Researches.CASTLE_AGE, GREATER_OR_EQUAL, ResearchStatus.COMPLETE),
                        researchStatus(Researches.IMPERIAL_AGE, LESS_THAN, ResearchStatus.PENDING),
                        canBuild(Buildings.HOUSE),
                        housingHeadroom(LESS_OR_EQUAL, 10),
                        populationHeadroom(NOT_EQUAL, 0),
                        pendingObjects(Buildings.HOUSE, LESS_OR_EQUAL, 2))
                .then(
                        build(Buildings.HOUSE),
                        chatLocalToSelf("building house"));
    }

    private Rule buildBuildings(Building building, int amount) {
        return rule("build " + building)
                .when(
                        researchStatus(Researches.CASTLE_AGE, GREATER_OR_EQUAL, ResearchStatus.PENDING),
                        researchStatus(Researches.IMPERIAL_AGE, LESS_THAN, ResearchStatus.PENDING),
                        canBuild(building),
                        buildingTypeCountTotal(building, LESS_THAN, amount))
                .then(
                        build(building),
                        chatLocalToSelf("building " + building));
    }

    private Rule researchTech(Research research) {
        return rule("research " + research)
                .when(
                        researchStatus(Researches.CASTLE_AGE, GREATER_OR_EQUAL, ResearchStatus.PENDING),
                        canResearch(research))
                .then(
                        research(research),
                        chatLocalToSelf("researching " + research),
                        disableSelf());
    }

    private Rule trainUnits(Units unit, int amount) {
        return rule("train " + unit)
                .when(
                        researchStatus(Researches.CASTLE_AGE, GREATER_OR_EQUAL, ResearchStatus.PENDING),
                        researchStatus(Researches.IMPERIAL_AGE, LESS_THAN, ResearchStatus.PENDING),
                        unitTypeCountTotal(unit, LESS_THAN, amount),
                        canTrain(unit))
                .then(
                        train(unit),
                        chatLocalToSelf("training " + unit));
    }

}
