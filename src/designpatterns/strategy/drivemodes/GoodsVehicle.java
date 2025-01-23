package designpatterns.strategy.drivemodes;

import designpatterns.strategy.drivemodes.behaviour.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
