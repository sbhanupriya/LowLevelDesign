package designpatterns.creational.factory.Burgers.concreteProduct.wheat;

import designpatterns.creational.factory.Burgers.concreteProduct.Burger;

public class PremiumWheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Premium Wheat Burger is being made");
    }
}
