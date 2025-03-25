package designpatterns.creational.factory.Vehicles;

public class VehicleSimulator {
    public static void main(String[] args){
        Vehicle v1 = VehicleFactory.getVehicle("Bike");
        v1.start();
        v1.stop();
        Vehicle v2 = VehicleFactory.getVehicle("Truck");
        v2.start();
        v2.stop();
        Vehicle v3 = VehicleFactory.getVehicle("Car");
        v3.start();
        v3.stop();
    }
}
