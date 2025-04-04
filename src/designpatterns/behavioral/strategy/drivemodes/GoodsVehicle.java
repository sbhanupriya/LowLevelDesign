package designpatterns.behavioral.strategy.drivemodes;

import designpatterns.behavioral.strategy.drivemodes.behaviour.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
