package designpatterns.behavioral.strategy.simuduck.models;

import designpatterns.behavioral.strategy.simuduck.interfaces.Flywable;
import designpatterns.behavioral.strategy.simuduck.interfaces.Quackable;

public abstract class Duck {
    Flywable flywable;
    Quackable quackable;
    public void swim(){
        System.out.println("Duck is Swimming");
    }
    public void performQuack(){
        quackable.quack();
    }
    public void performFylwable(){
        flywable.fly();
    }
    public void setFlywable(Flywable flywable){
        this.flywable = flywable;
    }
    public void setQuackable(Quackable quackable){
        this.quackable = quackable;
    }
    public abstract void display();
}
