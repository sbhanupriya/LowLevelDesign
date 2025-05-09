package designpatterns.behavioral.decorator.Pizza;

public class Mushroom extends ToppingDecorator{
    @Override
    public int cost() {
        return this.pizza.cost() + 10;
    }
    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }

}
