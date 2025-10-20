package org.example.strategy;

public class Client {
    public static void main(String[] args) {
        strategy.GoogleMaps googleMaps = new strategy.GoogleMaps();
        googleMaps.findPath("Delhi", "Agra", "Walk");
    }
}
