package designpatterns.strategy.drivemodes.behaviour;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("I have normal Driving Strategy");
    }
}
