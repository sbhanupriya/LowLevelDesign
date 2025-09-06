package designpatterns.behavioral.strategy.robots.implementations;

import designpatterns.behavioral.strategy.robots.interfaces.Walkable;

public class NormalWalk implements Walkable {

    @Override
    public void walk() {
        System.out.println("Hii I am coming towards you");
    }
}
