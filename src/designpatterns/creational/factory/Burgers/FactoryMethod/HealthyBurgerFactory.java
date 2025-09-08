package designpatterns.creational.factory.Burgers.FactoryMethod;

import designpatterns.creational.factory.Burgers.concreteProduct.Burger;

import designpatterns.creational.factory.Burgers.concreteProduct.wheat.ClassicWheatBurger;
import designpatterns.creational.factory.Burgers.concreteProduct.wheat.PremiumWheatBurger;
import designpatterns.creational.factory.Burgers.concreteProduct.wheat.VegWheatBurger;

public class HealthyBurgerFactory implements BurgerFactory{
    @Override
    public Burger getBurger(String type) {
        if(type.equalsIgnoreCase("VEGIE"))
            return new VegWheatBurger();
        else if(type.equalsIgnoreCase("CLASSIC"))
            return new ClassicWheatBurger();
        else if(type.equalsIgnoreCase("PREMIUM"))
            return new PremiumWheatBurger();
        else
            return  null;
    }
}
