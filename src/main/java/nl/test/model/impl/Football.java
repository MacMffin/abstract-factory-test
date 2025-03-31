package nl.test.model.impl;

import nl.test.model.interfaces.Ball;

public class Football implements Ball {
    @Override
    public String getBallName() {
        return "Football";
    }

    @Override
    public void printBallColour() {
        System.out.println("The colour is white with black patches.");
    }
}
