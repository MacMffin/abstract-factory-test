package nl.test.model.impl;

import nl.test.model.interfaces.Pitch;

public class BaseballPitch implements Pitch {
    @Override
    public String getFieldShape() {
        return "Square";
    }

    @Override
    public void printFieldSize() {
        System.out.println("318 feet (97 m) to left field, 399 feet (122 m) to left-center field, 408 feet (124 m) to center field, 385 feet (117 m) to right-center field, and 314 feet (96 m) to right field");
    }
}
