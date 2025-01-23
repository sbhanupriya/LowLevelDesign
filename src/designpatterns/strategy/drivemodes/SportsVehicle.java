package designpatterns.strategy.drivemodes;

import designpatterns.strategy.drivemodes.behaviour.SportsDriveStrategy;

public class SportsVehicle extends  Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
