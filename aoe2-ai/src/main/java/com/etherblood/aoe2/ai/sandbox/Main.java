package com.etherblood.aoe2.ai.sandbox;

import com.etherblood.aoe2.ai.core.script.JavaScript;
import static com.etherblood.aoe2.ai.core.actions.Actions.*;
import static com.etherblood.aoe2.ai.core.variables.parameters.RelOp.*;
import static com.etherblood.aoe2.ai.core.variables.parameters.buildings.Buildings.*;
import static com.etherblood.aoe2.ai.core.facts.Facts.*;
import static com.etherblood.aoe2.ai.core.variables.DifficultyParameter.*;
import static com.etherblood.aoe2.ai.core.variables.Toggle.ON;
import com.etherblood.aoe2.ai.core.variables.parameters.Perimeter;
import static com.etherblood.aoe2.ai.core.variables.strategicnumbers.StrategicNumbers.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Philipp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        JavaScript script = new JavaScript();
        script.rule("init")
                .then(
                        disableSelf(),
                        enableWallPlacement(Perimeter.INNER),
                        assignBuilders(HOUSE, 2),
                        setStrategicNumber(CAP_CIVILIAN_EXPLORERS, 0),
                        setStrategicNumber(ENABLE_NEW_BUILDING_SYSTEM, ON),
                        setStrategicNumber(PERCENT_CIVILIAN_BUILDERS, 100),
                        setStrategicNumber(CAP_CIVILIAN_BUILDERS, 100),
                        setStrategicNumber(TOTAL_NUMBER_EXPLORERS, 1),
                        setStrategicNumber(NUMBER_EXPLORE_GROUPS, 1),
                        setStrategicNumber(INTELLIGENT_GATHERING, ON),
                        setDifficultyParameter(ABILITY_TO_DODGE_MISSLES, 100),
                        setDifficultyParameter(ABILITY_TO_MAINTAIN_DISTANCE, 100));

        script.rule("collect food")
                .when(
                        woodAmount(GREATER_OR_EQUAL, 30))
                .then(
                        setStrategicNumber(WOOD_GATHERER_PERCENTAGE, 10),
                        setStrategicNumber(FOOD_GATHERER_PERCENTAGE, 90),
                        disableSelf());

        script.rule("collect wood")
                .when(
                        civilianPopulation(GREATER_THAN, 10))
                .then(
                        setStrategicNumber(WOOD_GATHERER_PERCENTAGE, 20),
                        setStrategicNumber(FOOD_GATHERER_PERCENTAGE, 80),
                        disableSelf());

        script.rule("first house built")
                .when(
                        buildingTypeCount(HOUSE, NOT_EQUAL, 0))
                .then(
                        assignBuilders(HOUSE, 1),
                        disableSelf());

        script.rule("build houses")
                .when(
                        canBuild(HOUSE),
                        housingHeadroom(LESS_OR_EQUAL, 2),
                        populationHeadroom(NOT_EQUAL, 0),
                        pendingObjects(HOUSE, EQUAL, 0))
                .then(
                        build(HOUSE),
                        chatLocalToSelf("building house"));


        List<JavaScript> scripts = Arrays.asList(
                new BoarScript(),
                new DarkAgeScript(),
                new FeudalAgeScript(),
                new CastleAgeScript(),
                script);

        String filePath = "C:\\Program Files (x86)\\Steam\\SteamApps\\common\\Age2HD\\resources\\_common\\ai\\";
        String fileName = "javaAI";
        File aiFile = new File(filePath + fileName + ".per");
        try (PrintWriter writer = new PrintWriter(aiFile)) {
            for (JavaScript s : scripts) {
                s.unparse(writer::print);
                s.unparse(System.out::print);
            }
        }
        new File(filePath + fileName + ".ai").createNewFile();
    }

}
