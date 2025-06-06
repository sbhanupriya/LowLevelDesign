package designpatterns.behavioral.strategy.simuduck.implementations;

import designpatterns.behavioral.strategy.simuduck.interfaces.Quackable;

public class Quack implements Quackable {
    @Override
    public void quack() {
        System.out.println("Ducks Quacks");
    }
}
