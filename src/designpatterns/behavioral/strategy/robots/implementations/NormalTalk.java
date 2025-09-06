package designpatterns.behavioral.strategy.robots.implementations;

import designpatterns.behavioral.strategy.robots.interfaces.Talkable;

public class NormalTalk implements Talkable {
    @Override
    public void talk() {
        System.out.println("Hello!! How can I help you?");
    }
}
