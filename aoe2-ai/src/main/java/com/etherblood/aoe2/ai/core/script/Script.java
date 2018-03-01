package com.etherblood.aoe2.ai.core.script;

import java.util.function.Consumer;

/**
 *
 * @author Philipp
 */
public interface Script {

    void unparse(Consumer<String> output);
}
