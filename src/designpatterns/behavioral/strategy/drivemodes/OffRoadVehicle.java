package designpatterns.behavioral.strategy.drivemodes;

import designpatterns.behavioral.strategy.drivemodes.behaviour.SportsDriveStrategy;

public class OffRoadVehicle extends  Vehicle{
    public OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
