package designpatterns.creational.abstractfactory.Food;

import designpatterns.creational.abstractfactory.Food.concreteProduct.GarlicBread;
import designpatterns.creational.factory.Burgers.concreteProduct.Burger;

public interface FoodFactory {
    Burger getBurger(String type);
    GarlicBread getBread(String type);
}
