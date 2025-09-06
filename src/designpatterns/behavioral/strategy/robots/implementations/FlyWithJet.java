package designpatterns.behavioral.strategy.robots.implementations;

import designpatterns.behavioral.strategy.robots.interfaces.Flyable;

public class FlyWithJet implements Flyable {
    @Override
    public void fly() {
        System.out.println("Robots flies with Jet Powered");
    }
}
