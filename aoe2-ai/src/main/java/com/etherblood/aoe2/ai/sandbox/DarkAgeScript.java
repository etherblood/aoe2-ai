package com.etherblood.aoe2.ai.sandbox;

import com.etherblood.aoe2.ai.core.JavaScript;
import com.etherblood.aoe2.ai.core.Rule;
import static com.etherblood.aoe2.ai.core.actions.Actions.*;
import static com.etherblood.aoe2.ai.core.variables.parameters.RelOp.*;
import static com.etherblood.aoe2.ai.core.facts.Facts.*;
import com.etherblood.aoe2.ai.core.variables.ResearchStatus;
import com.etherblood.aoe2.ai.core.variables.parameters.buildings.Buildings;
import com.etherblood.aoe2.ai.core.variables.parameters.researches.Researches;
import com.etherblood.aoe2.ai.core.variables.parameters.Dropsite;
import com.etherblood.aoe2.ai.core.variables.parameters.Resource;
import com.etherblood.aoe2.ai.core.variables.parameters.buildings.Building;
import com.etherblood.aoe2.ai.core.variables.parameters.researches.Research;
import com.etherblood.aoe2.ai.core.variables.parameters.units.UnitLine;
import com.etherblood.aoe2.ai.core.variables.parameters.units.Units;

/**
 *
 * @author Philipp
 */
public class DarkAgeScript extends JavaScript {

    public DarkAgeScript() {
        super("dark age");

        rule("init")
                .when(
                        researchStatus(Researches.FEUDAL_AGE, LESS_THAN, ResearchStatus.PENDING))
                .then(
                        chatLocalToSelf("started dark-age script"),
                        disableSelf());

        trainUnits(UnitLine.VILLAGER, 25);
        researchTech(Researches.FEUDAL_AGE).when(unitTypeCount(UnitLine.VILLAGER, GREATER_OR_EQUAL, 20));
        researchTech(Researches.LOOM).when(not(canTrain(UnitLine.VILLAGER)));
        buildBuildings(Buildings.MILL, 1).when(
                buildingTypeCount(Buildings.HOUSE, GREATER_THAN, 0),
                or(and(resourceFound(Resource.FOOD),
                        dropsiteMinDistance(Dropsite.FOOD, GREATER_THAN, 5)),
                        gameTime(GREATER_THAN, 480)));
        buildBuildings(Buildings.LUMBER_CAMP, 1).when(
                or(
                        and(
                                resourceFound(Resource.WOOD),
                                dropsiteMinDistance(Dropsite.WOOD, GREATER_THAN, 4)),
                        gameTime(GREATER_THAN, 360)));

//        rule("Villager retasking")
//                .when(
//                        researchStatus(FEUDAL_AGE, LESS_THAN, PENDING),
//                        foodAmount(LESS_THAN, 50),
//                        pendingObjects(VILLAGER, LESS_THAN, 1))
//                .then(
//                        retaskGatherers(FOOD, 50),
//                        dropResources(FOOD, 5));
    }

    private Rule buildBuildings(Building building, int amount) {
        return rule("build " + building)
                .when(
                        researchStatus(Researches.FEUDAL_AGE, LESS_THAN, ResearchStatus.PENDING),
                        canBuild(building),
                        buildingTypeCountTotal(building, LESS_THAN, amount))
                .then(
                        build(building),
                        chatLocalToSelf("building " + building));
    }

    private Rule researchTech(Research research) {
        return rule("research " + research)
                .when(
                        canResearch(research))
                .then(
                        research(research),
                        chatLocalToSelf("researching " + research),
                        disableSelf());
    }

    private Rule trainUnits(Units unit, int amount) {
        return rule("train " + unit)
                .when(
                        researchStatus(Researches.FEUDAL_AGE, LESS_THAN, ResearchStatus.PENDING),
                        unitTypeCountTotal(unit, LESS_THAN, amount),
                        canTrain(unit))
                .then(
                        train(unit),
                        chatLocalToSelf("training " + unit));
    }

}
