package com.etherblood.aoe2.ai.sandbox;

import com.etherblood.aoe2.ai.core.script.JavaScript;
import static com.etherblood.aoe2.ai.core.actions.Actions.disableSelf;
import static com.etherblood.aoe2.ai.core.actions.Actions.jumpRule;
import static com.etherblood.aoe2.ai.core.actions.Actions.requestHunters;
import static com.etherblood.aoe2.ai.core.actions.Actions.research;
import static com.etherblood.aoe2.ai.core.actions.Actions.retaskGatherers;
import static com.etherblood.aoe2.ai.core.actions.Actions.setStrategicNumber;
import com.etherblood.aoe2.ai.core.variables.parameters.RelOp;
import static com.etherblood.aoe2.ai.core.facts.Facts.*;
import static com.etherblood.aoe2.ai.core.variables.parameters.researches.Researches.*;
import static com.etherblood.aoe2.ai.core.variables.strategicnumbers.StrategicNumbers.*;
import static com.etherblood.aoe2.ai.core.facts.Facts.researchCompleted;
import static com.etherblood.aoe2.ai.core.actions.Actions.chatLocalToSelf;
import com.etherblood.aoe2.ai.core.variables.parameters.buildings.Buildings;
import static com.etherblood.aoe2.ai.core.variables.parameters.Dropsite.LIVE_BOAR;
import static com.etherblood.aoe2.ai.core.variables.parameters.Dropsite.BOAR_HUNTING;
import static com.etherblood.aoe2.ai.core.variables.parameters.RelOp.*;
import static com.etherblood.aoe2.ai.core.variables.parameters.Resource.*;
import com.etherblood.aoe2.ai.core.variables.parameters.units.UnitGroup;
import com.etherblood.aoe2.ai.core.variables.parameters.units.UnitLine;

/**
 *
 * @author Philipp
 */
public class BoarScript extends JavaScript {

    public BoarScript() {
        super("boar hunting");

        rule("loom")
                .when(
                        unitTypeCount(UnitGroup.VILLAGERS, RelOp.GREATER_OR_EQUAL, 10),
                        dropsiteMinDistance(LIVE_BOAR, LESS_OR_EQUAL, 32),
                        canResearch(LOOM))
                .then(research(LOOM),
                        chatLocalToSelf("researching loom"),
                        disableSelf());
        rule()
                .when(
                        or(
                                or(
                                        dropsiteMinDistance(LIVE_BOAR, RelOp.LESS_OR_EQUAL, -1),
                                        unitTypeCount(UnitLine.VILLAGER_HUNTER, RelOp.GREATER_OR_EQUAL, 1)),
                                or(
                                        unitTypeCount(UnitLine.VILLAGER, RelOp.LESS_THAN, 9),
                                        not(researchCompleted(LOOM)))))
                .then(
                        jumpRule(2));

        rule()
                .when(dropsiteMinDistance(LIVE_BOAR, RelOp.LESS_OR_EQUAL, MAXIMUM_HUNT_DROP_DISTANCE))
                .then(
                        setStrategicNumber(ENABLE_BOAR_HUNTING, 2),
                        setStrategicNumber(MINIMUM_BOAR_HUNT_GROUP_SIZE, 1),
                        setStrategicNumber(MINIMUM_NUMBER_HUNTERS, 1),
                        setStrategicNumber(MAXIMUM_FOOD_DROP_DISTANCE, 16),
                        setStrategicNumber(MAXIMUM_HUNT_DROP_DISTANCE, 32),
                        requestHunters(1),
                        chatLocalToSelf("trying to start a hunt"));

        rule()
                .when(
                        dropsiteMinDistance(LIVE_BOAR, RelOp.LESS_OR_EQUAL, 32),
                        dropsiteMinDistance(LIVE_BOAR, RelOp.GREATER_OR_EQUAL, 0),
                        strategicNumber(ENABLE_BOAR_HUNTING, RelOp.EQUAL, 2),
                        strategicNumber(MINIMUM_BOAR_HUNT_GROUP_SIZE, RelOp.EQUAL, 1),
                        strategicNumber(MINIMUM_NUMBER_HUNTERS, RelOp.EQUAL, 1),
                        unitTypeCount(UnitLine.VILLAGER_HUNTER, RelOp.LESS_OR_EQUAL, 0))
                .then(
                        retaskGatherers(FOOD, 1),
                        disableSelf());

        rule()
                .when(
                        dropsiteMinDistance(LIVE_BOAR, RelOp.LESS_OR_EQUAL, 16),
                        strategicNumber(ENABLE_BOAR_HUNTING, RelOp.GREATER_OR_EQUAL, 1),
                        unitTypeCount(UnitLine.VILLAGER_HUNTER, RelOp.EQUAL, 1))
                .then(setStrategicNumber(MINIMUM_NUMBER_HUNTERS, 2),
                        requestHunters(1),
                        chatLocalToSelf("requesting support hunters"));

        rule()
                .when(
                        dropsiteMinDistance(LIVE_BOAR, RelOp.LESS_OR_EQUAL, 10),
                        dropsiteMinDistance(LIVE_BOAR, RelOp.GREATER_OR_EQUAL, 0),
                        strategicNumber(ENABLE_BOAR_HUNTING, RelOp.GREATER_OR_EQUAL, 1),
                        or(
                                unitTypeCount(UnitLine.VILLAGER_HUNTER, RelOp.EQUAL, 1),
                                unitTypeCount(UnitLine.VILLAGER_HUNTER, RelOp.EQUAL, 2)))
                .then(setStrategicNumber(MINIMUM_BOAR_HUNT_GROUP_SIZE, 7),
                        setStrategicNumber(MINIMUM_NUMBER_HUNTERS, 7),
                        retaskGatherers(FOOD, 1),
                        requestHunters(6),
                        chatLocalToSelf("adding more hunters."));

        rule()
                .when(
                        or(
                                dropsiteMinDistance(LIVE_BOAR, RelOp.GREATER_THAN, MAXIMUM_HUNT_DROP_DISTANCE),
                                and(
                                        dropsiteMinDistance(LIVE_BOAR, RelOp.GREATER_OR_EQUAL, 11),
                                        dropsiteMinDistance(BOAR_HUNTING, RelOp.LESS_OR_EQUAL, 10))),
                        strategicNumber(MINIMUM_NUMBER_HUNTERS, RelOp.GREATER_THAN, 2))
                .then(setStrategicNumber(MINIMUM_BOAR_HUNT_GROUP_SIZE, 1),
                        setStrategicNumber(MINIMUM_NUMBER_HUNTERS, 2),
                        chatLocalToSelf("Lowering min-hunters."));

        rule()
                .when(or(
                                dropsiteMinDistance(LIVE_BOAR, RelOp.GREATER_THAN, 32),
                                dropsiteMinDistance(LIVE_BOAR, RelOp.LESS_THAN, 0)),
                        or(buildingTypeCount(Buildings.MILL, RelOp.GREATER_THAN, 1),
                                unitTypeCount(UnitLine.VILLAGER, RelOp.GREATER_OR_EQUAL, 12)),
                        unitTypeCount(UnitLine.VILLAGER, RelOp.GREATER_OR_EQUAL, 18),
                        strategicNumber(ENABLE_BOAR_HUNTING, RelOp.NOT_EQUAL, 1))
                .then(setStrategicNumber(ENABLE_BOAR_HUNTING, 1),
                        setStrategicNumber(MINIMUM_BOAR_HUNT_GROUP_SIZE, 2),
                        setStrategicNumber(MINIMUM_NUMBER_HUNTERS, 2),
                        chatLocalToSelf("Disabling hunting restrictions."),
                        disableSelf());
    }

}
