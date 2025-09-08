package designpatterns.creational.abstractfactory.Food.concreteProduct;

public class ClassicGarlicBread implements GarlicBread{
    public void prepare() {
        System.out.println("Classic bread in making");
    }
}
