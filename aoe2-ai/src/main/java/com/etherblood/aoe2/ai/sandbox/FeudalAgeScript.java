package com.etherblood.aoe2.ai.sandbox;

import com.etherblood.aoe2.ai.core.JavaScript;
import com.etherblood.aoe2.ai.core.Rule;
import static com.etherblood.aoe2.ai.core.actions.Actions.*;
import com.etherblood.aoe2.ai.core.variables.parameters.RelOp;
import static com.etherblood.aoe2.ai.core.variables.parameters.RelOp.*;
import static com.etherblood.aoe2.ai.core.facts.Facts.*;
import com.etherblood.aoe2.ai.core.variables.ResearchStatus;
import com.etherblood.aoe2.ai.core.variables.parameters.buildings.Buildings;
import com.etherblood.aoe2.ai.core.variables.parameters.researches.Researches;
import static com.etherblood.aoe2.ai.core.variables.Toggle.ON;
import com.etherblood.aoe2.ai.core.variables.parameters.Dropsite;
import com.etherblood.aoe2.ai.core.variables.parameters.Perimeter;
import com.etherblood.aoe2.ai.core.variables.parameters.Resource;
import com.etherblood.aoe2.ai.core.variables.parameters.units.Unit;
import com.etherblood.aoe2.ai.core.variables.parameters.Wall;
import com.etherblood.aoe2.ai.core.variables.parameters.buildings.Building;
import com.etherblood.aoe2.ai.core.variables.parameters.researches.Research;
import com.etherblood.aoe2.ai.core.variables.parameters.units.UnitLine;
import com.etherblood.aoe2.ai.core.variables.parameters.units.Units;
import static com.etherblood.aoe2.ai.core.variables.strategicnumbers.StrategicNumbers.*;

/**
 *
 * @author Philipp
 */
public class FeudalAgeScript extends JavaScript {

    public FeudalAgeScript() {
        super("feudal age");

        rule("init")
                .when(
                        researchStatus(Researches.FEUDAL_AGE, GREATER_OR_EQUAL, ResearchStatus.PENDING),
                        researchStatus(Researches.CASTLE_AGE, LESS_THAN, ResearchStatus.PENDING))
                .then(
                        //                        setStrategicNumber(AUTO_BUILD_DROPSITES, ON),
                        //                        setStrategicNumber(AUTO_BUILD_FARMS, ON),
                        setStrategicNumber(WOOD_GATHERER_PERCENTAGE, 40),
                        setStrategicNumber(FOOD_GATHERER_PERCENTAGE, 55),
                        setStrategicNumber(GOLD_GATHERER_PERCENTAGE, 5),
                        setStrategicNumber(STONE_GATHERER_PERCENTAGE, 0),
                        chatLocalToSelf("started feudal-age script"),
                        disableSelf());
        rule("wall")
                .when(
                        researchStatus(Researches.FEUDAL_AGE, GREATER_OR_EQUAL, ResearchStatus.PENDING),
                        researchStatus(Researches.CASTLE_AGE, LESS_THAN, ResearchStatus.PENDING),
                        canBuildWall(Perimeter.OUTER, Wall.PALISADE_WALL))
                .then(
                        buildWall(Perimeter.OUTER, Wall.PALISADE_WALL));
        rule("gates")
                .when(
                        researchStatus(Researches.FEUDAL_AGE, GREATER_OR_EQUAL, ResearchStatus.PENDING),
                        researchStatus(Researches.CASTLE_AGE, LESS_THAN, ResearchStatus.PENDING),
                        canBuildGate(Perimeter.OUTER))
                .then(
                        buildGate(Perimeter.OUTER));

        rule("build goldcamp")
                .when(researchStatus(Researches.FEUDAL_AGE, GREATER_OR_EQUAL, ResearchStatus.PENDING),
                        canBuild(Buildings.MINING_CAMP),
                        dropsiteMinDistance(Dropsite.GOLD, RelOp.GREATER_THAN, 4),
                        resourceFound(Resource.GOLD),
                        pendingObjects(Buildings.MINING_CAMP, RelOp.EQUAL, 0))
                .then(
                        build(Buildings.MINING_CAMP),
                        chatLocalToSelf("building gold-camp"));
        rule("build lumbercamp")
                .when(researchStatus(Researches.FEUDAL_AGE, GREATER_OR_EQUAL, ResearchStatus.PENDING),
                        canBuild(Buildings.LUMBER_CAMP),
                        dropsiteMinDistance(Dropsite.WOOD, RelOp.GREATER_THAN, 4),
                        resourceFound(Resource.WOOD),
                        pendingObjects(Buildings.LUMBER_CAMP, RelOp.EQUAL, 0))
                .then(
                        build(Buildings.LUMBER_CAMP),
                        chatLocalToSelf("building lumber-camp"));
        rule("build mill")
                .when(researchStatus(Researches.FEUDAL_AGE, GREATER_OR_EQUAL, ResearchStatus.PENDING),
                        canBuild(Buildings.MILL),
                        dropsiteMinDistance(Dropsite.FOOD, RelOp.GREATER_THAN, 4),
                        resourceFound(Resource.FOOD),
                        pendingObjects(Buildings.MILL, RelOp.EQUAL, 0))
                .then(
                        build(Buildings.MILL),
                        chatLocalToSelf("building mill"));
        researchTech(Researches.WHEEL_BARROW);
        trainUnits(UnitLine.VILLAGER, 30);
        researchTech(Researches.CASTLE_AGE).when(unitTypeCount(UnitLine.VILLAGER, GREATER_OR_EQUAL, 25));
        researchTech(Researches.DOUBLE_BIT_AXE);
        researchTech(Researches.HORSE_COLLAR);
//        trainUnits(Unit.SKIRMISHER_LINE, 10).when(townUnderAttack(), compareGlobal(FOOD_AMOUNT, GREATER_THAN, 150));
//        trainUnits(Unit.SPEARMAN_LINE, 10).when(townUnderAttack(), compareGlobal(FOOD_AMOUNT, GREATER_THAN, 150));
        buildBuildings(Buildings.FARM, 20).when(
                not(townUnderAttack()),
                woodAmount(GREATER_THAN, 250),
                pendingObjects(Buildings.FARM, EQUAL, 0),
                idleFarmCount(EQUAL, 0));
        buildBuildings(Buildings.BARRACKS, 1);
        buildBuildings(Buildings.ARCHERY_RANGE, 1);
        buildBuildings(Buildings.BLACKSMITH, 1);
//        researchTech(SCALE_MAIL).when(townUnderAttack(), compareGlobal(FOOD_AMOUNT, GREATER_THAN, 150));
//        researchTech(FORGING).when(townUnderAttack(), compareGlobal(FOOD_AMOUNT, GREATER_THAN, 150));

        rule("build houses")
                .when(
                        researchStatus(Researches.FEUDAL_AGE, GREATER_OR_EQUAL, ResearchStatus.PENDING),
                        researchStatus(Researches.CASTLE_AGE, LESS_THAN, ResearchStatus.PENDING),
                        canBuild(Buildings.HOUSE),
                        housingHeadroom(RelOp.LESS_OR_EQUAL, 4),
                        populationHeadroom(RelOp.NOT_EQUAL, 0),
                        pendingObjects(Buildings.HOUSE, RelOp.EQUAL, 0))
                .then(
                        build(Buildings.HOUSE),
                        chatLocalToSelf("building house"));
    }

    private Rule buildBuildings(Building building, int amount) {
        return rule("build " + building)
                .when(
                        researchStatus(Researches.FEUDAL_AGE, GREATER_OR_EQUAL, ResearchStatus.PENDING),
                        researchStatus(Researches.CASTLE_AGE, LESS_THAN, ResearchStatus.PENDING),
                        canBuild(building),
                        buildingTypeCountTotal(building, LESS_THAN, amount))
                .then(
                        build(building),
                        chatLocalToSelf("building " + building));
    }

    private Rule researchTech(Research research) {
        return rule("research " + research)
                .when(
                        researchStatus(Researches.FEUDAL_AGE, GREATER_OR_EQUAL, ResearchStatus.PENDING),
                        canResearch(research))
                .then(
                        research(research),
                        chatLocalToSelf("researching " + research),
                        disableSelf());
    }

    private Rule trainUnits(Units unit, int amount) {
        return rule("train " + unit)
                .when(
                        researchStatus(Researches.FEUDAL_AGE, GREATER_OR_EQUAL, ResearchStatus.PENDING),
                        researchStatus(Researches.CASTLE_AGE, LESS_THAN, ResearchStatus.PENDING),
                        unitTypeCountTotal(unit, LESS_THAN, amount),
                        canTrain(unit))
                .then(
                        train(unit),
                        chatLocalToSelf("training " + unit));
    }

}
