package com.etherblood.aoe2.ai.core.actions;

import com.etherblood.aoe2.ai.core.variables.parameters.researches.Research;
import com.etherblood.aoe2.ai.core.variables.parameters.units.Units;
import com.etherblood.aoe2.ai.core.variables.DifficultyParameter;
import com.etherblood.aoe2.ai.core.variables.HasValue;
import com.etherblood.aoe2.ai.core.variables.parameters.Commodity;
import com.etherblood.aoe2.ai.core.variables.parameters.DiplomaticStance;
import com.etherblood.aoe2.ai.core.variables.parameters.GoalId;
import com.etherblood.aoe2.ai.core.variables.parameters.MathOp;
import com.etherblood.aoe2.ai.core.variables.parameters.Perimeter;
import com.etherblood.aoe2.ai.core.variables.parameters.PlayerNumber;
import com.etherblood.aoe2.ai.core.variables.parameters.Resource;
import com.etherblood.aoe2.ai.core.variables.parameters.TauntId;
import com.etherblood.aoe2.ai.core.variables.parameters.Wall;
import com.etherblood.aoe2.ai.core.variables.strategicnumbers.StrategicNumber;
import com.etherblood.aoe2.ai.core.variables.parameters.buildings.Building;

/**
 *
 * @author Philipp
 */
public class Actions {

    public static Action doNothing() {
        return new ActionImpl("do-nothing");
    }

    public static Action acknowlegeTaunt(PlayerNumber player, TauntId taunt) {
        return new ActionImpl("acknowledge-taunt", player.value(), taunt.value());
    }

    public static Action attackNow() {
        return new ActionImpl("attack-now");
    }

    public static Action build(Building building) {
        return new ActionImpl("build", building.buildingValue());
    }

    public static Action buildForward(Building building) {
        return new ActionImpl("build-forward", building.buildingValue());
    }

    public static Action buildGate(Perimeter perimeter) {
        return new ActionImpl("build-gate", perimeter.value());
    }

    public static Action buildWall(Perimeter perimeter, Wall wallType) {
        return new ActionImpl("build-wall", perimeter.value(), wallType.value());
    }

    public static Action buyCommodity(Commodity commodity) {
        return new ActionImpl("buy-commodity", commodity.value());
    }

    public static Action ccAddResource(Resource resourceType, int amount) {
        return new ActionImpl("cc-add-resource", resourceType.value(), Integer.toString(amount));
    }

    public static Action chatLocal(String message) {
        return new ActionImpl("chat-local \"" + message + "\"");
    }

    public static Action chatLocalToSelf(String message) {
        return new ActionImpl("chat-local-to-self \"" + message + "\"");
    }

    public static Action chatToAll(String message) {
        return new ActionImpl("chat-to-all \"" + message + "\"");
    }

    public static Action chatToAllies(String message) {
        return new ActionImpl("chat-to-allies \"" + message + "\"");
    }

    public static Action chatToEnemies(String message) {
        return new ActionImpl("chat-to-enemies \"" + message + "\"");
    }

    public static Action chatToPlayer(PlayerNumber number, String message) {
        return new ActionImpl("chat-to-player", number.value() + " \"" + message + "\"");
    }

    public static Action chatTrace(int value) {
        return new ActionImpl("chat-trace", Integer.toString(value));
    }

    public static Action clearTributeMemory(PlayerNumber player, Resource resource) {
        return new ActionImpl("clear-tribute-memory", player.value(), resource.value());
    }

    public static Action deleteBuilding(Building building) {
        return new ActionImpl("delete-building", building.buildingValue());
    }

    public static Action deleteUnit(Units unit) {
        return new ActionImpl("delete-unit", unit.unitValue());
    }

    public static Action disableSelf() {
        return new ActionImpl("disable-self");
    }

    public static Action enableWallPlacement(Perimeter perimeter) {
        return new ActionImpl("enable-wall-placement", perimeter.value());
    }

    public static Action generateRandomNumber(int value) {
        return new ActionImpl("generate-random-number", Integer.toString(value));
    }

    public static Action log(String message) {
        return new ActionImpl("log \"" + message + "\"");
    }

    public static Action logTrace(String message) {
        return new ActionImpl("log-trace \"" + message + "\"");
    }

    public static Action releaseEscrow(Resource resource) {
        return new ActionImpl("release-escrow", resource.value());
    }

    public static Action research(Research tech) {
        return new ActionImpl("research", tech.researchValue());
    }

    public static Action resign() {
        return new ActionImpl("resign");
    }

    public static Action sellCommodity(Commodity commodity) {
        return new ActionImpl("sell-commodity", commodity.value());
    }

    public static Action setDifficultyParameter(DifficultyParameter<Integer> difParam, int value) {
        return new ActionImpl("set-difficulty-parameter", difParam.value(), Integer.toString(value));
    }

    public static Action setDoctrine(int value) {
        return new ActionImpl("set-doctrine", Integer.toString(value));
    }

    public static Action setEscrowPercentage(Resource resourceType, int value) {
        return new ActionImpl("set-escrow-percentage", resourceType.value(), Integer.toString(value));
    }

    public static Action setGoal(GoalId goal, int value) {
        return new ActionImpl("set-goal", goal.value(), Integer.toString(value));
    }

    public static Action setSharedGoal(GoalId goal, int value) {
        return new ActionImpl("set-shared-goal", goal.value(), Integer.toString(value));
    }

    public static Action setStance(PlayerNumber player, DiplomaticStance stance) {
        return new ActionImpl("set-stance", player.value(), stance.value());
    }

    public static Action setStrategicNumber(StrategicNumber<Integer> number, int value) {
        return new ActionImpl("set-strategic-number", number.value(), Integer.toString(value));
    }

    public static <T extends HasValue> Action setStrategicNumber(StrategicNumber<T> number, T value) {
        return new ActionImpl("set-strategic-number", number.value(), value.value());
    }

    public static Action spy() {
        return new ActionImpl("spy");
    }

    public static Action taunt(TauntId value) {
        return new ActionImpl("taunt", value.value());
    }

    public static Action tauntUsingRange(TauntId value, int range) {
        return new ActionImpl("taunt-using-range", value.value(), Integer.toString(range));
    }

    public static Action train(Units unit) {
        return new ActionImpl("train", unit.unitValue());
    }

    public static Action tributeToPlayer(PlayerNumber player, Resource resource, int value) {
        return new ActionImpl("tribute-to-player", player.value(), resource.value(), Integer.toString(value));
    }

    public static Action chatDataToSelf(String message, int value) {
        return chatDataToSelf(message, Integer.toString(value));
    }

    public static Action chatDataToSelf(String message, String value) {
        return new ActionImpl("up-chat-data-to-self \"" + message + "\" c:", value);
    }

    public static Action assignBuilders(Building building, int value) {
        return new ActionImpl("up-assign-builders c:", building.buildingValue() + " c:", Integer.toString(value));
    }

    public static Action retaskGatherers(Resource resouce, int value) {
        return new ActionImpl("up-retask-gatherers", resouce.value() + " c:", Integer.toString(value));
    }

    public static Action dropResources(Resource resouce, int value) {
        return new ActionImpl("up-drop-resources", resouce.value() + " c:", Integer.toString(value));
    }

    public static Action requestHunters(int value) {
        return new ActionImpl("up-request-hunters c:", Integer.toString(value));
    }

    public static Action jumpRule(int value) {
        return new ActionImpl("up-jump-rule", Integer.toString(value));
    }

    public static Action resetUnit(Units unit) {
        return new ActionImpl("up-reset-unit", "c:", unit.unitValue());
    }

    public static Action modifyGoal(MathOp op, GoalId goal, int value) {
        return new ActionImpl("up-modify-goal", goal.value(), op.value(), Integer.toString(value));
    }

    public static Action modifySn(MathOp op, StrategicNumber<Integer> goal, int value) {
        return new ActionImpl("up-modify-sn", goal.value(), op.value(), Integer.toString(value));
    }

    public static Action retreatNow() {
        return new ActionImpl("up-retreat-now");
    }
}
