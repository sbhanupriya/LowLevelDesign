package designpatterns.behavioral.strategy.drivemodes;

import designpatterns.behavioral.strategy.drivemodes.behaviour.SportsDriveStrategy;

public class SportsVehicle extends  Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
