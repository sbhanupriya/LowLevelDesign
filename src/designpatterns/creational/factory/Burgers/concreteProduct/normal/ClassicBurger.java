package designpatterns.creational.factory.Burgers.concreteProduct.normal;

import designpatterns.creational.factory.Burgers.concreteProduct.Burger;

public class ClassicBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Making classic burger!!!");
    }
}
