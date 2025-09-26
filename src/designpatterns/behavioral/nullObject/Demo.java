package designpatterns.behavioral.nullObject;

public class Demo {
    public static void main(String[] args){
        Vehicle vehicle = VehicleFactory.getVehicle("Car");
        System.out.println("Car:Seating-"+ vehicle.getSeatingCapacity() + ":Tank-" + vehicle.getTankCapacity());

        Vehicle other = VehicleFactory.getVehicle("Default");
        System.out.println("Car:Seating-"+ other.getSeatingCapacity() + ":Tank-" + other.getTankCapacity());



    }
}
