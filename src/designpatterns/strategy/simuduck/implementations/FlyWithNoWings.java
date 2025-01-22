package designpatterns.strategy.simuduck.implementations;

import designpatterns.strategy.simuduck.interfaces.Flywable;

public class FlyWithNoWings implements Flywable {

    @Override
    public void fly() {
        System.out.println("I cannot fly!!!");
    }
}
