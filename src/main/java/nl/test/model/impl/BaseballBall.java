package nl.test.model.impl;

import nl.test.model.interfaces.Ball;

public class BaseballBall implements Ball {

    @Override
    public String getBallName() {
        return "BaseballBall";
    }

    @Override
    public void printBallColour() {
        System.out.println("This ball is white.");
    }
}
