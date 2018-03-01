package com.etherblood.aoe2.ai.core.script;

import com.etherblood.aoe2.ai.core.variables.system.SystemSymbol;
import java.util.function.Consumer;

public class ConditionalScript implements Script {

    private SystemSymbol systemSymbol;
    private boolean ifDefined = true;
    private Script trueScript, falseScript;

    public void setIfDefined(boolean ifDefined) {
        this.ifDefined = ifDefined;
    }

    public void setTrueScript(Script trueScript) {
        this.trueScript = trueScript;
    }

    public void setFalseScript(Script falseScript) {
        this.falseScript = falseScript;
    }

    public void setSystemSymbol(SystemSymbol systemSymbol) {
        this.systemSymbol = systemSymbol;
    }

    @Override
    public void unparse(Consumer<String> output) {
        if (ifDefined) {
            output.accept("#load-if-defined ");
        } else {
            output.accept("#load-if-not-defined ");
        }
        output.accept(systemSymbol.value());
        output.accept("\n");
        trueScript.unparse(output);
        output.accept("\n");
        if (falseScript != null) {
            output.accept("#else\n");
            falseScript.unparse(output);
            output.accept("\n");
        }
        output.accept("#end-if\n");
    }

}
