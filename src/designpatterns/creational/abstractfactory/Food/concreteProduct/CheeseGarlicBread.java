package designpatterns.creational.abstractfactory.Food.concreteProduct;

public class CheeseGarlicBread implements GarlicBread{
    @Override
    public void prepare() {
        System.out.println("Cheese bread in making");
    }
}
