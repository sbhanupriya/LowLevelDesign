package designpatterns.behavioral.decorator.Pizza;

public class ExtraChesse extends ToppingDecorator{
    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }
    public ExtraChesse(BasePizza pizza){
       this.pizza = pizza;
    }
}
