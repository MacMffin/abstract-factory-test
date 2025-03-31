package nl.test.model.impl;

import nl.test.model.interfaces.Pitch;

public class FootballPitch implements Pitch {

    @Override
    public String getFieldShape() {
        return "Rectangle";
    }

    @Override
    public void printFieldSize() {
        System.out.println("105 m × 68 m (344 ft × 223 ft)");
    }
}
