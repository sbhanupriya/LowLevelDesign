package designpatterns.behavioral.decorator.Pizza;

import designpatterns.behavioral.decorator.Coffee.*;

public class PizzaShop {
    public static void main(String[] args){
       BasePizza pizza = new FarmHouse();
       pizza = new ExtraChesse(pizza);
       pizza = new Mushroom(pizza);

       System.out.println(pizza.cost());

    }
}
