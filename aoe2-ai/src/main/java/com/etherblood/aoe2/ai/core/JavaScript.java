package com.etherblood.aoe2.ai.core;

import com.etherblood.aoe2.ai.core.variables.Constant;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Philipp
 */
public class JavaScript implements Script {

    private final String name;
    private final List<Constant> constants = new ArrayList<>();
    private final List<Rule> rules = new ArrayList<>();

    public JavaScript() {
        this(null);
    }

    public JavaScript(String name) {
        this.name = name;
    }

    public final Rule rule(String name) {
        Rule rule = new Rule(name);
        rules.add(rule);
        return rule;
    }

    public Rule rule() {
        return rule(null);
    }

    @Override
    public void unparse(Consumer<String> output) {
        output.accept(";******************************** ");
        if (name != null) {
            output.accept(name);
        }
        output.accept(" ********************************\n");
        for (Constant constant : constants) {
            constant.unparseDeclaration(output);
            output.accept("\n");
        }
        output.accept("\n");
        for (Rule rule : rules) {
            rule.unparse(output);
            output.accept("\n");
        }

    }

    public final Constant constant(String name, int value) {
        return constant(name, Integer.toString(value));
    }

    public final Constant constant(String name, String value) {
        Constant constant = new Constant(name, value);
        constants.add(constant);
        return constant;
    }
}
