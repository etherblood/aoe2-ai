package com.etherblood.aoe2.ai.core;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 *
 * @author Philipp
 */
public class NativeScript implements Script {

    private final String path;

    public NativeScript(String path) {
        this.path = path;
    }

    @Override
    public void unparse(Consumer<String> output) {
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            stream.forEach(output);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
