package designpatterns.behavioral.strategy.robots.implementations;

import designpatterns.behavioral.strategy.robots.interfaces.Talkable;

public class NoTalk implements Talkable {
    @Override
    public void talk() {
        System.out.println("No talk allowed");
    }
}
