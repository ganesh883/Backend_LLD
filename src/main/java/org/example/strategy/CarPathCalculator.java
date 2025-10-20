package org.example.strategy;

public class CarPathCalculator implements strategy.PathCalculatorStrategy {
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Car Path");
    }
}
