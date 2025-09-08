package designpatterns.creational.abstractfactory.Food;

import designpatterns.creational.abstractfactory.Food.concreteProduct.CheeseGarlicBread;
import designpatterns.creational.abstractfactory.Food.concreteProduct.ClassicGarlicBread;
import designpatterns.creational.abstractfactory.Food.concreteProduct.GarlicBread;
import designpatterns.creational.factory.Burgers.concreteProduct.Burger;
import designpatterns.creational.factory.Burgers.concreteProduct.normal.ClassicBurger;
import designpatterns.creational.factory.Burgers.concreteProduct.normal.PremiumBurger;
import designpatterns.creational.factory.Burgers.concreteProduct.normal.VegBurger;

public class NormalFoodFactory implements FoodFactory{
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

    @Override
    public GarlicBread getBread(String type) {
        if(type.equalsIgnoreCase("CHEESE"))
            return new CheeseGarlicBread();
        else if(type.equalsIgnoreCase("CLASSIC"))
            return new ClassicGarlicBread();
        else
            return  null;
    }
}
