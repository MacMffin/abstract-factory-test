package nl.test.model.impl;

import jakarta.enterprise.context.ApplicationScoped;
import nl.test.model.interfaces.Ball;
import nl.test.model.interfaces.Pitch;
import nl.test.model.interfaces.SportsFactory;

@ApplicationScoped
public class BaseballFactory implements SportsFactory {
    @Override
    public Ball createBall() {
        return new Baseball();
    }

    @Override
    public Pitch createPitch() {
        return new BaseballPitch();
    }
}
