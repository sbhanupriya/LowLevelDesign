package designpatterns.creational.abstractfactory.Vehicle;


public interface VehicleFactory {
    Vehicle createVehicle(String carType);
}
