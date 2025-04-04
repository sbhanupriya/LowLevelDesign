package designpatterns.behavioral.strategy.simuduck.implementations;

import designpatterns.behavioral.strategy.simuduck.interfaces.Flywable;

public class FlyWithNoWings implements Flywable {

    @Override
    public void fly() {
        System.out.println("I cannot fly!!!");
    }
}
