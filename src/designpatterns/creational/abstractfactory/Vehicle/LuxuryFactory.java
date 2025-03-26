package designpatterns.creational.abstractfactory.Vehicle;

public class LuxuryFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle(String carType) {
        switch(carType){
            case "bmw":
                return new BMW();
            case "mercedes":
                return new Mercedes();
            case "tesla":
                return new Tesla();
            default:
                throw new IllegalArgumentException("Invalid luxury vehicle type: " + carType);
        }
    }
}
