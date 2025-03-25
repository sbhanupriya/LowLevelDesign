package designpatterns.creational.factory.Vehicles.Implementations;

import designpatterns.creational.factory.Vehicles.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck Starts");
    }

    @Override
    public void stop() {
        System.out.println("Truck Stops");
    }
}
