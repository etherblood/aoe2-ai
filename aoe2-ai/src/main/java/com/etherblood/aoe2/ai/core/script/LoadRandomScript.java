package com.etherblood.aoe2.ai.core.script;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LoadRandomScript implements Script {

    private final List<Mapping> randomFiles = new ArrayList<>();
    private String defaultFile;

    public void setDefaultFile(String defaultFile) {
        this.defaultFile = defaultFile;
    }

    public void addRandomFile(String file, int percentChance) {
        randomFiles.add(new Mapping(percentChance, file));
    }

    @Override
    public void unparse(Consumer<String> output) {
        if (!randomFiles.isEmpty()) {
            output.accept("(load-random ");
            for (Mapping mapping : randomFiles) {
                output.accept(Integer.toString(mapping.percentChance));
                output.accept("\"");
                output.accept(mapping.filename);
                output.accept("\"\n");
            }
        } else {
            output.accept("(load ");
        }
        if (defaultFile != null) {
            output.accept("\"");
            output.accept(defaultFile);
            output.accept("\"\n");
        }
        output.accept(")");
    }

    private class Mapping {

        public int percentChance;
        public String filename;

        public Mapping(int percentChance, String filename) {
            this.percentChance = percentChance;
            this.filename = filename;
        }
    }
}
