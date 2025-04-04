package designpatterns.behavioral.strategy.simuduck.models;

import designpatterns.behavioral.strategy.simuduck.implementations.FlyWithWings;
import designpatterns.behavioral.strategy.simuduck.implementations.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        flywable = new FlyWithWings();
        quackable = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am real Mallard Duck which can fly and quacks...");
    }
}
