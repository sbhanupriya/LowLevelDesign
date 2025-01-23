package designpatterns.strategy.drivemodes.behaviour;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("I have sports drive strategy");
    }
}
