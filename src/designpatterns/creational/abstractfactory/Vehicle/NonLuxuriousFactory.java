package designpatterns.creational.abstractfactory.Vehicle;

public class NonLuxuriousFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String carType) {
        switch(carType){
            case "hyundai":
                return new Hyundai();
            case "swift":
                return new Swift();
            default:
                throw new IllegalArgumentException("Invalid non-luxury vehicle type: " + carType);
        }
    }
}
