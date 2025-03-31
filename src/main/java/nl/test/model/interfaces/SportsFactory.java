package nl.test.model.interfaces;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface SportsFactory {
    Ball createBall();
    Pitch createPitch();
}
