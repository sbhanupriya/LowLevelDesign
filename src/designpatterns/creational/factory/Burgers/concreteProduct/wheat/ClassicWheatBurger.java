package designpatterns.creational.factory.Burgers.concreteProduct.wheat;

import designpatterns.creational.factory.Burgers.concreteProduct.Burger;

public class ClassicWheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Classic Wheat Burger is being made");
    }
}
