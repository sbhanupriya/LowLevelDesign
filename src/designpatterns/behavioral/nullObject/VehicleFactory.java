package designpatterns.behavioral.nullObject;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        if(type.compareTo("Car")==0){
            return new Car();
        }
        return new NullObject();
    }
}
