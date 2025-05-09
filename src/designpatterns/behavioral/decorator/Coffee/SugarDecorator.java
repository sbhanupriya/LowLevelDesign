package designpatterns.behavioral.decorator.Coffee;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Sugar ";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.2;
    }
}
