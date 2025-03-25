package designpatterns.creational.factory.Vehicles;

import designpatterns.creational.factory.Vehicles.Implementations.Bike;
import designpatterns.creational.factory.Vehicles.Implementations.Car;
import designpatterns.creational.factory.Vehicles.Implementations.Truck;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        if(type.compareTo("Bike")==0)
            return new Bike();
        else if(type.compareTo("Car")==0)
            return new Car();
        else if(type.compareTo("Truck")==0)
            return new Truck();
        else {
            throw new IllegalArgumentException("Vehicle Type not supported");
        }
    }
}
