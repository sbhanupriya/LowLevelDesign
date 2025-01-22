package designpatterns.strategy.simuduck.implementations;

import designpatterns.strategy.simuduck.interfaces.Flywable;

public class FlyRocketPowered implements Flywable {
    @Override
    public void fly() {
        System.out.println("I am flying with rocket");
    }
}
