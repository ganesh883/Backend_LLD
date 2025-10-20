package org.example.strategy;

public class PathCalculatorFactory {
    public static strategy.PathCalculatorStrategy getPathCalculatorForMode(String mode) {
        if (mode.equals("Car")) {
            return new CarPathCalculator();
        }
        else if (mode.equals("Bike")) {
            return new BikePathCalculator();
        } else {
            return new strategy.WalkPathCalculator();
        }
    }
}
