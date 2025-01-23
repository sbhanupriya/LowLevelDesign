package designpatterns.strategy.drivemodes;

import designpatterns.strategy.drivemodes.behaviour.SportsDriveStrategy;

public class OffRoadVehicle extends  Vehicle{
    public OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
