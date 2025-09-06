package designpatterns.behavioral.strategy.robots.implementations;

import designpatterns.behavioral.strategy.robots.interfaces.Flyable;

public class FlyWithWings implements Flyable {
    @Override
    public void fly() {
        System.out.println("Robot flies with wings");
    }
}
