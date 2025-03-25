package designpatterns.creational.factory.Vehicles.Implementations;

import designpatterns.creational.factory.Vehicles.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike Starts");
    }

    @Override
    public void stop() {
        System.out.println("Bike Stops");
    }
}
