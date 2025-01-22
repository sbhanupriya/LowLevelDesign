package designpatterns.strategy.simuduck.implementations;

import designpatterns.strategy.simuduck.interfaces.Quackable;

public class Squeak implements Quackable {
    @Override
    public void quack() {
        System.out.println("Ducks Squeaks Squeaks");
    }
}
