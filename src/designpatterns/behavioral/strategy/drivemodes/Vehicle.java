package designpatterns.behavioral.strategy.drivemodes;

import designpatterns.behavioral.strategy.drivemodes.behaviour.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    public void drive(){
        this.driveStrategy.drive();
    }
}
