package solid.lsp;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args){
        List<EngineVehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new MotorCycle());

        for(EngineVehicle vehicle: vehicleList){
            System.out.println(vehicle.hasEngine());
            System.out.println(vehicle.getNumberOfWheels());
        }

    }
}
