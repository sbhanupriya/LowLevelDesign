package designpatterns.creational.abstractfactory.Food;

import designpatterns.creational.abstractfactory.Food.concreteProduct.GarlicBread;
import designpatterns.creational.factory.Burgers.concreteProduct.Burger;

public class FactoryCreator {
    FoodFactory getFactory(String type){
        if(type.equalsIgnoreCase("HEALTH"))
            return new HealthyFoodFactory();
        else
            return new NormalFoodFactory();
    }
    public static void main(String args[]){
        FactoryCreator creator = new FactoryCreator();
        FoodFactory factory =  creator.getFactory("HEALTH");
        GarlicBread bread = factory.getBread("CLASSIC");
        Burger burger = factory.getBurger("CLASSIC");
        bread.prepare();
        burger.prepare();

        // normal factory
        factory = creator.getFactory("NORMAL");
        bread = factory.getBread("CLASSIC");
        burger = factory.getBurger("CLASSIC");
        bread.prepare();
        burger.prepare();

    }
}
