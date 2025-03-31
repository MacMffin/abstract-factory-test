package nl.test.model.impl;

import nl.test.model.interfaces.Ball;

public class Baseball implements Ball {

    @Override
    public String getBallName() {
        return "Baseball";
    }

    @Override
    public void printBallColour() {
        System.out.println("This ball is white.");
    }
}
