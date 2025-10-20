package org.example.strategy;

public class BikePathCalculator implements strategy.PathCalculatorStrategy {
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Bike Path");
    }
}
