package designpatterns.creational.abstractfactory.Vehicle;

public class AbstractVehicleFactorySimulator {
    public static void main(String[] args){
        VehicleFactory factory = VehicleFactoryProvider.getFactory(true);
        Vehicle v1 = factory.createVehicle("tesla");
        v1.average();

        factory = VehicleFactoryProvider.getFactory(false);
        v1 = factory.createVehicle("hyundai");
        v1.average();
    }
}
