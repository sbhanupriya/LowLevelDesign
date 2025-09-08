package designpatterns.creational.factory.Burgers.FactoryMethod;

import designpatterns.creational.factory.Burgers.concreteProduct.Burger;

public interface BurgerFactory {
    Burger getBurger(String type);
}
