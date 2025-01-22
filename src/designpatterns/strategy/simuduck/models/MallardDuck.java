package designpatterns.strategy.simuduck.models;

import designpatterns.strategy.simuduck.implementations.FlyWithWings;
import designpatterns.strategy.simuduck.implementations.Quack;

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
