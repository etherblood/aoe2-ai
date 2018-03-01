package com.etherblood.aoe2.ai.core.script;

import com.etherblood.aoe2.ai.core.actions.Action;
import com.etherblood.aoe2.ai.core.actions.Actions;
import com.etherblood.aoe2.ai.core.facts.Fact;
import com.etherblood.aoe2.ai.core.facts.Facts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Philipp
 */
public class Rule {

    private final String name;
    private final List<Fact> facts = new ArrayList<>();
    private final List<Action> actions = new ArrayList<>();

    public Rule() {
        this(null);
    }

    public Rule(String name) {
        this.name = name;
    }

    public Rule when(Fact... facts) {
        this.facts.addAll(Arrays.asList(facts));
        return this;
    }

    public Rule then(Action... actions) {
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    public String name() {
        return name;
    }

    public void unparse(Consumer<String> output) {
        if (name != null) {
            output.accept(";" + name);
        }
        output.accept("\n(defrule\n");
        for (Fact fact : facts.isEmpty() ? Arrays.asList(Facts._true()) : facts) {
            output.accept("(");
            fact.unparse(output);
            output.accept(")\n");
        }
        output.accept("=>\n");
        for (Action action : actions.isEmpty() ? Arrays.asList(Actions.doNothing()) : actions) {
            output.accept("(");
            action.unparse(output);
            output.accept(")\n");
        }
        output.accept(")\n");
    }

}
