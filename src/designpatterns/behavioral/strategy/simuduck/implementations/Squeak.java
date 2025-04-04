package designpatterns.behavioral.strategy.simuduck.implementations;

import designpatterns.behavioral.strategy.simuduck.interfaces.Quackable;

public class Squeak implements Quackable {
    @Override
    public void quack() {
        System.out.println("Ducks Squeaks Squeaks");
    }
}
