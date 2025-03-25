package designpatterns.creational.factory.Vehicles.Implementations;

import designpatterns.creational.factory.Vehicles.Vehicle;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car Starts");
    }

    @Override
    public void stop() {
        System.out.println("Car Stops");
    }
}
