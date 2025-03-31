package nl.test.model.impl;

import nl.test.model.interfaces.Ball;
import nl.test.model.interfaces.Pitch;
import nl.test.model.interfaces.SportsFactory;

public class FootballFactory implements SportsFactory {
    @Override
    public Ball createBall() {
        return new Football();
    }

    @Override
    public Pitch createPitch() {
        return new FootballPitch();
    }
}
