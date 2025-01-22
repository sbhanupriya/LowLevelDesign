package designpatterns.strategy.simuduck.implementations;

import designpatterns.strategy.simuduck.interfaces.Flywable;

public class FlyWithWings implements Flywable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}
