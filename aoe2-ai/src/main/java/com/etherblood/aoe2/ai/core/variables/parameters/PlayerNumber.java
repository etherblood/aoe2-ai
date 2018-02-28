package com.etherblood.aoe2.ai.core.variables.parameters;

/**
 * a valid player number or one of the wildcard parameters (if explicitly
 * allowed by the fact/action): any-ally any-computer any-computer-ally
 * any-computer-enemy any-computer-neutral any-enemy any-human any-human-ally
 * any-human-enemy any-human-neutral any-neutral every-ally every-computer
 * every-enemy every-human every-neutral For a detailed description of wildcard
 * parameters, see the &quot;Wildcard Parameters&quot; section later in this
 * document. Note: Wildcard parameters applying to allies do not apply to self.
 *
 * @author Philipp
 */
public class PlayerNumber {

    public final static PlayerNumber ANY_ALLY = new PlayerNumber("any-ally");
    public final static PlayerNumber ANY_COMPUTER = new PlayerNumber("any-computer");
    public final static PlayerNumber ANY_COMPUTER_ALLY = new PlayerNumber("any-computer-ally");
    public final static PlayerNumber ANY_COMPUTER_ENEMY = new PlayerNumber("any-computer-enemy");
    public final static PlayerNumber ANY_COMPUTER_NEUTRAL = new PlayerNumber("any-computer-neutral");
    public final static PlayerNumber ANY_ENEMY = new PlayerNumber("any-enemy");
    public final static PlayerNumber ANY_HUMAN = new PlayerNumber("any-human");
    public final static PlayerNumber ANY_HUMAN_ALLY = new PlayerNumber("any-human-ally");
    public final static PlayerNumber ANY_HUMAN_ENEMY = new PlayerNumber("any-human-enemy");
    public final static PlayerNumber ANY_HUMAN_NEUTRAL = new PlayerNumber("any-human-neutral");
    public final static PlayerNumber ANY_NEUTRAL = new PlayerNumber("any-neutral");
    public final static PlayerNumber EVERY_ALLY = new PlayerNumber("every-ally");
    public final static PlayerNumber EVERY_COMPUTER = new PlayerNumber("every-computer");
    public final static PlayerNumber EVERY_ENEMY = new PlayerNumber("every-enemy");
    public final static PlayerNumber EVERY_HUMAN = new PlayerNumber("every-human");
    public final static PlayerNumber EVERY_NEUTRAL = new PlayerNumber("every-neutral");

    private final String number;

    public PlayerNumber(int number) {
        this.number = Integer.toString(number);
    }

    PlayerNumber(String number) {
        this.number = number;
    }

    public String value() {
        return number;
    }
}
