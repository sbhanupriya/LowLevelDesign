package designpatterns.creational.factory.Burgers.concreteProduct.wheat;

import designpatterns.creational.factory.Burgers.concreteProduct.Burger;

public class VegWheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Veg Wheat Burger is being made");
    }
}
