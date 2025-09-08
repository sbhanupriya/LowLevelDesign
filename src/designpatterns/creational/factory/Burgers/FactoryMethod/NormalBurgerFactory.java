package designpatterns.creational.factory.Burgers.FactoryMethod;

import designpatterns.creational.factory.Burgers.concreteProduct.Burger;
import designpatterns.creational.factory.Burgers.concreteProduct.normal.ClassicBurger;
import designpatterns.creational.factory.Burgers.concreteProduct.normal.PremiumBurger;
import designpatterns.creational.factory.Burgers.concreteProduct.normal.VegBurger;

public class NormalBurgerFactory implements BurgerFactory{
    @Override
    public Burger getBurger(String type) {
        if(type.equalsIgnoreCase("VEGIE"))
            return new VegBurger();
        else if(type.equalsIgnoreCase("CLASSIC"))
            return new ClassicBurger();
        else if(type.equalsIgnoreCase("PREMIUM"))
            return new PremiumBurger();
        else
            return  null;
    }
}
