package com.etherblood.aoe2.ai.core.actions;

import java.util.function.Consumer;

/**
 *
 * @author Philipp
 */
public interface Action {

    default String unparse() {
        StringBuilder builder = new StringBuilder();
        unparse(builder::append);
        return builder.toString();
    }
    void unparse(Consumer<String> output);
}
