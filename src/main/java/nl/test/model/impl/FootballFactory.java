package nl.test.model.impl;

import jakarta.enterprise.context.ApplicationScoped;
import nl.test.model.annotations.Football;
import nl.test.model.interfaces.Ball;
import nl.test.model.interfaces.Pitch;
import nl.test.model.interfaces.SportsFactory;

@ApplicationScoped
@Football
public class FootballFactory implements SportsFactory {
    @Override
    public Ball createBall() {
        return new FootballBall();
    }

    @Override
    public Pitch createPitch() {
        return new FootballPitch();
    }
}
