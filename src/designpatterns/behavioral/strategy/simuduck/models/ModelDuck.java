package designpatterns.behavioral.strategy.simuduck.models;

import designpatterns.behavioral.strategy.simuduck.implementations.FlyWithNoWings;
import designpatterns.behavioral.strategy.simuduck.implementations.Quack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flywable = new FlyWithNoWings();
        quackable = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am Model Duck");
    }
}
