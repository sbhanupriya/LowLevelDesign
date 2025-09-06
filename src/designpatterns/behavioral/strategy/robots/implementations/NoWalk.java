package designpatterns.behavioral.strategy.robots.implementations;

import designpatterns.behavioral.strategy.robots.interfaces.Walkable;

public class NoWalk implements Walkable {
    @Override
    public void walk() {
        System.out.println("Sorry you need to move me!! I can't wolk");
    }
}
