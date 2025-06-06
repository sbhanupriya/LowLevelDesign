package designpatterns.behavioral.strategy.simuduck.implementations;

import designpatterns.behavioral.strategy.simuduck.interfaces.Quackable;

public class MuteQuack implements Quackable {
    @Override
    public void quack() {
        System.out.println("No sound made by Duck");
    }
}
