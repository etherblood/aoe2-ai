package com.etherblood.aoe2.ai.core.facts;

import com.etherblood.aoe2.ai.core.variables.IntValue;
import com.etherblood.aoe2.ai.core.variables.parameters.buildings.Building;
import com.etherblood.aoe2.ai.core.variables.parameters.researches.Research;
import com.etherblood.aoe2.ai.core.variables.parameters.units.Units;
import com.etherblood.aoe2.ai.core.variables.ResearchStatus;
import com.etherblood.aoe2.ai.core.variables.ScriptValue;
import com.etherblood.aoe2.ai.core.variables.StringValue;
import com.etherblood.aoe2.ai.core.variables.parameters.Age;
import com.etherblood.aoe2.ai.core.variables.parameters.Civilization;
import com.etherblood.aoe2.ai.core.variables.parameters.Commodity;
import com.etherblood.aoe2.ai.core.variables.parameters.Difficulty;
import com.etherblood.aoe2.ai.core.variables.parameters.DiplomaticStance;
import com.etherblood.aoe2.ai.core.variables.parameters.Dropsite;
import com.etherblood.aoe2.ai.core.variables.parameters.GameType;
import com.etherblood.aoe2.ai.core.variables.parameters.GoalId;
import com.etherblood.aoe2.ai.core.variables.parameters.MapSize;
import com.etherblood.aoe2.ai.core.variables.parameters.Perimeter;
import com.etherblood.aoe2.ai.core.variables.parameters.PlayerNumber;
import com.etherblood.aoe2.ai.core.variables.parameters.RelOp;
import com.etherblood.aoe2.ai.core.variables.parameters.Resource;
import com.etherblood.aoe2.ai.core.variables.parameters.StartingResources;
import com.etherblood.aoe2.ai.core.variables.parameters.TauntId;
import com.etherblood.aoe2.ai.core.variables.parameters.TypeOp;
import com.etherblood.aoe2.ai.core.variables.parameters.VictoryCondition;
import com.etherblood.aoe2.ai.core.variables.parameters.Wall;
import com.etherblood.aoe2.ai.core.variables.strategicnumbers.StrategicNumber;

/**
 *
 * @author Philipp
 */
public class Facts {

    public static Fact _true() {
        return new FactImpl("true");
    }

    public static Fact _false() {
        return new FactImpl("false");
    }

    public static Fact and(Fact factA, Fact factB) {
        return new BinaryOperationFact("and", factA, factB);
    }

    public static Fact nand(Fact factA, Fact factB) {
        return new BinaryOperationFact("nand", factA, factB);
    }

    public static Fact nor(Fact factA, Fact factB) {
        return new BinaryOperationFact("nor", factA, factB);
    }

    public static Fact not(Fact fact) {
        return new UnaryOperationFact("not", fact);
    }

    public static Fact or(Fact factA, Fact factB) {
        return new BinaryOperationFact("or", factA, factB);
    }

    public static Fact xnor(Fact factA, Fact factB) {
        return new BinaryOperationFact("xnor", factA, factB);
    }

    public static Fact xor(Fact factA, Fact factB) {
        return new BinaryOperationFact("xor", factA, factB);
    }

    public static Fact attackSoldierCount(RelOp op, int value) {
        return new FactImpl("attack-soldier-count", op, IntValue.of(value));
    }

    public static Fact attackWarboatCount(RelOp op, int value) {
        return new FactImpl("attack-warboat-count", op, IntValue.of(value));
    }

    public static Fact buildingAvailable(Building building) {
        return new FactImpl("building-available", building);
    }

    public static Fact buildingCount(RelOp op, int value) {
        return new FactImpl("building-count", op, IntValue.of(value));
    }

    public static Fact buildingCountTotal(RelOp op, int value) {
        return new FactImpl("building-count-total", op, IntValue.of(value));
    }

    public static Fact buildingTypeCount(Building building, RelOp op, int value) {
        return new FactImpl("building-type-count", building, op, IntValue.of(value));
    }

    public static Fact buildingTypeCountTotal(Building building, RelOp op, int value) {
        return new FactImpl("building-type-count-total", building, op, IntValue.of(value));
    }

    public static Fact canAffordBuilding(Building building) {
        return new FactImpl("can-afford-building", building);
    }

    public static Fact canAffordCompleteWall(Perimeter perimeter, Wall wall) {
        return new FactImpl("can-afford-complete-wall", perimeter, wall);
    }

    public static Fact canAffordResearch(Research research) {
        return new FactImpl("can-afford-research", research);
    }

    public static Fact canAffordUnit(Units unit) {
        return new FactImpl("can-afford-unit", unit);
    }

    public static Fact canBuild(Building building) {
        return new FactImpl("can-build", building);
    }

    public static Fact canBuildGate(Perimeter perimeter) {
        return new FactImpl("can-build-gate", perimeter);
    }

    public static Fact canBuildGateWithEscrow(Perimeter perimeter) {
        return new FactImpl("can-build-gate-with-escrow", perimeter);
    }

    public static Fact canBuildWall(Perimeter perimeter, Wall wall) {
        return new FactImpl("can-build-wall", perimeter, wall);
    }

    public static Fact canBuildWallWithEscrow(Perimeter perimeter, Wall wall) {
        return new FactImpl("can-build-wall-with-escrow", perimeter, wall);
    }

    public static Fact canBuildWithEscrow(Building building) {
        return new FactImpl("can-build-with-escrow", building);
    }

    public static Fact canBuyCommodity(Commodity commodity) {
        return new FactImpl("can-buy-commodity", commodity);
    }

    public static Fact canResearch(Research tech) {
        return new FactImpl("can-research", tech);
    }

    public static Fact canResearchWithEscrow(Research tech) {
        return new FactImpl("can-research-with-escrow", tech);
    }

    public static Fact canSellCommodity(Commodity commodity) {
        return new FactImpl("can-sell-commodity", commodity);
    }

    public static Fact canSpy() {
        return new FactImpl("can-spy");
    }

    public static Fact canSpyWithEscrow() {
        return new FactImpl("can-spy-with-escrow");
    }

    public static Fact canTrain(Units unit) {
        return new FactImpl("can-train", unit);
    }

    public static Fact canTrainWithEscrow(Units unit) {
        return new FactImpl("can-train-with-escrow", unit);
    }

    public static Fact ccPlayersBuildingCount(PlayerNumber player, RelOp op, int value) {
        return new FactImpl("cc-players-building-count ", player, op, IntValue.of(value));
    }

    public static Fact ccPlayersBuildingTypeCount(PlayerNumber player, Building building, RelOp op, int value) {
        return new FactImpl("cc-players-building-type-count ", player, building, op, IntValue.of(value));
    }

    public static Fact ccPlayersUnitCount(PlayerNumber player, RelOp op, int value) {
        return new FactImpl("cc-players-unit-count ", player, op, IntValue.of(value));
    }

    public static Fact ccPlayersUnitTypeCount(PlayerNumber player, Units unit, RelOp op, int value) {
        return new FactImpl("cc-players-unit-type-count ", player, unit, op, IntValue.of(value));
    }

    public static Fact cheatsEnabled() {
        return new FactImpl("cheats-enabled");
    }

    public static Fact civilianPopulation(RelOp op, int value) {
        return new FactImpl("civilian-population", op, IntValue.of(value));
    }

    public static Fact civSelected(Civilization civ) {
        return new FactImpl("civ-selected", civ);
    }

    public static Fact commodityBuyingPrice(Commodity commodity, RelOp op, int value) {
        return new FactImpl("commodity-buying-price", commodity, op, IntValue.of(value));
    }

    public static Fact commoditySellingPrice(Commodity commodity, RelOp op, int value) {
        return new FactImpl("commodity-selling-price", commodity, op, IntValue.of(value));
    }

    public static Fact currentAge(RelOp op, Age age) {
        return new FactImpl("current-age", op, age);
    }

    public static Fact currentAgeTime(RelOp op, int value) {
        return new FactImpl("current-age-time", op, IntValue.of(value));
    }

    public static Fact currentScore(RelOp op, int value) {
        return new FactImpl("current-score", op, IntValue.of(value));
    }

    public static Fact deathMatchGame() {
        return new FactImpl("death-match-game");
    }

    public static Fact defendSoldierCount(RelOp op, int value) {
        return new FactImpl("defend-soldier-count", op, IntValue.of(value));
    }

    public static Fact defendWarboatCount(RelOp op, int value) {
        return new FactImpl("defend-warboat-count", op, IntValue.of(value));
    }

    public static Fact difficulty(RelOp op, Difficulty value) {
        return new FactImpl("difficulty", op, value);
    }

    public static Fact doctrine(int value) {
        return new FactImpl("doctrine", IntValue.of(value));
    }

    public static Fact dropsiteMinDistance(Dropsite resource, RelOp op, int value) {
        return dropsiteMinDistance(resource, op, IntValue.of(value));
    }

    public static Fact dropsiteMinDistance(Dropsite resource, RelOp op, ScriptValue value) {
        return new FactImpl("dropsite-min-distance", resource, op, value);
    }

    public static Fact enemyBuildingsInTown() {
        return new FactImpl("enemy-buildings-in-town");
    }

    public static Fact enemyCapturedRelics() {
        return new FactImpl("enemy-captured-relics");
    }

    public static Fact escrowAmount(Resource resource, RelOp op, int value) {
        return new FactImpl("escrow-amount", resource, op, IntValue.of(value));
    }

    public static Fact foodAmount(RelOp op, int value) {
        return new FactImpl("food-amount", op, IntValue.of(value));
    }

    public static Fact gameTime(RelOp op, int value) {
        return new FactImpl("game-time", op, IntValue.of(value));
    }

    public static Fact gameType(GameType gameType) {
        return new FactImpl("game-type", gameType);
    }

    public static Fact gateCount(Perimeter perimeter, RelOp op, int value) {
        return new FactImpl("gate-count", perimeter, op, IntValue.of(value));
    }

    public static Fact goal(GoalId goal, int value) {
        return new FactImpl("goal", goal, IntValue.of(value));
    }

    public static Fact goldAmount(RelOp op, int value) {
        return new FactImpl("gold-amount", op, IntValue.of(value));
    }

    public static Fact holdRelics() {
        return new FactImpl("hold-relics");
    }

    public static Fact holdKohRuin() {
        return new FactImpl("hold-koh-ruin");
    }

    public static Fact housingHeadroom(RelOp op, int value) {
        return new FactImpl("housing-headroom", op, IntValue.of(value));
    }

    public static Fact idleFarmCount(RelOp op, int value) {
        return new FactImpl("idle-farm-count", op, IntValue.of(value));
    }

    public static Fact mapSize(MapSize size) {
        return new FactImpl("map-size", size);
    }

    public static Fact mapType(MapSize size) {
        return new FactImpl("map-type", size);
    }

    public static Fact militaryPopulation(RelOp op, int value) {
        return new FactImpl("military-population", op, IntValue.of(value));
    }

    public static Fact playerComputer(PlayerNumber player) {
        return new FactImpl("player-computer", player);
    }

    public static Fact playerHuman(PlayerNumber player) {
        return new FactImpl("player-human", player);
    }

    public static Fact playerInGame(PlayerNumber player) {
        return new FactImpl("player-in-game", player);
    }

    public static Fact playerNumber(PlayerNumber player) {
        return new FactImpl("player-number", player);
    }

    public static Fact playerResigned(PlayerNumber player) {
        return new FactImpl("player-resigned", player);
    }

    public static Fact playerValid(PlayerNumber player) {
        return new FactImpl("player-valid", player);
    }

    public static Fact playersBuildingCount(PlayerNumber player, RelOp op, int value) {
        return new FactImpl("players-building-count", player, op, IntValue.of(value));
    }

    public static Fact playersBuildingTypeCount(PlayerNumber player, Building building, RelOp op, int value) {
        return new FactImpl("players-building-type-count", player, building, op, IntValue.of(value));
    }

    public static Fact playersCiv(PlayerNumber player, Civilization civ) {
        return new FactImpl("players-civ", player, civ);
    }

    public static Fact playersCivilianPopulation(PlayerNumber player, RelOp op, int value) {
        return new FactImpl("players-civilian-population", player, op, IntValue.of(value));
    }

    public static Fact playersCurrentAge(PlayerNumber player, RelOp op, Age value) {
        return new FactImpl("players-current-age", player, op, value);
    }

    public static Fact playersCurrentAgeTime(PlayerNumber player, RelOp op, int value) {
        return new FactImpl("players-current-age-time", player, op, IntValue.of(value));
    }

    public static Fact playersMilitaryPopulation(PlayerNumber player, RelOp op, int value) {
        return new FactImpl("players-military-population", player, op, IntValue.of(value));
    }

    public static Fact playersPopulation(PlayerNumber player, RelOp op, int value) {
        return new FactImpl("players-population", player, op, IntValue.of(value));
    }

    public static Fact playersScore(PlayerNumber player, RelOp op, int value) {
        return new FactImpl("players-score", player, op, IntValue.of(value));
    }

    public static Fact playersStance(PlayerNumber player, DiplomaticStance stance) {
        return new FactImpl("players-stance", player, stance);
    }

    public static Fact playersTribute(PlayerNumber player, Resource resource, RelOp op, int value) {
        return new FactImpl("players-tribute", player, resource, op, IntValue.of(value));
    }

    public static Fact playersTributeMemory(PlayerNumber player, Resource resource, RelOp op, int value) {
        return new FactImpl("players-tribute-memory", player, resource, op, IntValue.of(value));
    }

    public static Fact playersUnitCount(PlayerNumber player, RelOp op, int value) {
        return new FactImpl("players-unit-count", player, op, IntValue.of(value));
    }

    public static Fact playersUnitTypeCount(PlayerNumber player, Units unit, RelOp op, int value) {
        return new FactImpl("players-unit-count", player, unit, op, IntValue.of(value));
    }

    public static Fact population(RelOp op, int value) {
        return new FactImpl("population", op, IntValue.of(value));
    }

    public static Fact populationCap(RelOp op, int value) {
        return new FactImpl("population-cap", op, IntValue.of(value));
    }

    public static Fact populationHeadroom(RelOp op, int value) {
        return new FactImpl("population-headroom", op, IntValue.of(value));
    }

    public static Fact randomNumber(RelOp op, int value) {
        return new FactImpl("random-number", op, IntValue.of(value));
    }

    public static Fact regicideGame() {
        return new FactImpl("regicide-game");
    }

    public static Fact researchAvailable(Research tech) {
        return new FactImpl("research-available", tech);
    }

    public static Fact researchCompleted(Research tech) {
        return new FactImpl("research-completed", tech);
    }

    public static Fact resourceFound(Resource resource) {
        return new FactImpl("resource-found", resource);
    }

    public static Fact sharedGoal(GoalId goal, int value) {
        return new FactImpl("shared-goal", goal, IntValue.of(value));
    }

    public static Fact sheepAndForageTooFar() {
        return new FactImpl("sheep-and-forage-too-far");
    }

    public static Fact soldierCount(RelOp op, int value) {
        return new FactImpl("soldier-count", op, IntValue.of(value));
    }

    public static Fact stanceToward(PlayerNumber player, DiplomaticStance stance) {
        return new FactImpl("stance-toward", player, stance);
    }

    public static Fact startingAge(RelOp op, Age value) {
        return new FactImpl("starting-age", op, value);
    }

    public static Fact startingResources(RelOp op, StartingResources value) {
        return new FactImpl("starting-resources", op, value);
    }

    public static Fact stoneAmount(RelOp op, int value) {
        return new FactImpl("stone-amount", op, IntValue.of(value));
    }

    public static Fact strategicNumber(StrategicNumber<Integer> sn, RelOp compare, int value) {
        return new FactImpl("strategic-number", sn, compare, IntValue.of(value));
    }

    public static Fact tauntDetected(PlayerNumber player, TauntId taunt) {
        return new FactImpl("taunt-detected", player, taunt);
    }

    public static Fact townUnderAttack() {
        return new FactImpl("town-under-attack");
    }

    public static Fact unitAvailable(Units unit) {
        return new FactImpl("unit-available", unit);
    }

    public static Fact unitCount(RelOp op, int value) {
        return new FactImpl("unit-count", op, IntValue.of(value));
    }

    public static Fact unitCountTotal(RelOp op, int value) {
        return new FactImpl("unit-count-total", op, IntValue.of(value));
    }

    public static Fact unitTypeCount(Units unit, RelOp op, int value) {
        return new FactImpl("unit-type-count", unit, op, IntValue.of(value));
    }

    public static Fact unitTypeCountTotal(Units unit, RelOp op, int value) {
        return new FactImpl("unit-type-count-total", unit, op, IntValue.of(value));
    }

    public static Fact victoryCondition(VictoryCondition victory) {
        return new FactImpl("victory-condition", victory);
    }

    public static Fact wallCompletedPercentage(Perimeter unit, RelOp op, int value) {
        return new FactImpl("wall-completed-percentage", unit, op, IntValue.of(value));
    }

    public static Fact warboatCount(RelOp op, int value) {
        return new FactImpl("warboat-count", op, IntValue.of(value));
    }

    public static Fact woodAmount(RelOp op, int value) {
        return new FactImpl("wood-amount", op, IntValue.of(value));
    }

    public static Fact researchStatus(Research tech, RelOp op, ResearchStatus value) {
        return new FactImpl("up-research-status", TypeOp.C, tech, op, value);
    }

    public static Fact pendingObjects(Building building, RelOp op, int value) {
        return pendingObjects((ScriptValue) building, op, value);
    }

    public static Fact pendingObjects(Research tech, RelOp op, int value) {
        return pendingObjects((ScriptValue) tech, op, value);
    }

    public static Fact pendingObjects(Units unit, RelOp op, int value) {
        return pendingObjects((ScriptValue) unit, op, value);
    }

    private static Fact pendingObjects(ScriptValue obj, RelOp op, int value) {
        return new FactImpl("up-pending-objects", TypeOp.C, obj, op, IntValue.of(value));
    }
}
