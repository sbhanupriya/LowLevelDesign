package designpatterns.creational.abstractfactory.Food;

import designpatterns.creational.abstractfactory.Food.concreteProduct.*;
import designpatterns.creational.factory.Burgers.concreteProduct.Burger;
import designpatterns.creational.factory.Burgers.concreteProduct.wheat.ClassicWheatBurger;
import designpatterns.creational.factory.Burgers.concreteProduct.wheat.PremiumWheatBurger;
import designpatterns.creational.factory.Burgers.concreteProduct.wheat.VegWheatBurger;

public class HealthyFoodFactory implements FoodFactory {

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

    @Override
    public GarlicBread getBread(String type) {
            if(type.equalsIgnoreCase("CHEESE"))
                return new ChesseWheatGarlicBread();
            else if(type.equalsIgnoreCase("CLASSIC"))
                return new ClassicWheatGarlicBread();
            else
                return  null;
        }
}
