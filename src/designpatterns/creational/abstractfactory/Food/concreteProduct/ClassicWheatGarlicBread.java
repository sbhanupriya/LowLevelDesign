package designpatterns.creational.abstractfactory.Food.concreteProduct;

public class ClassicWheatGarlicBread implements GarlicBread {
    public void prepare() {
        System.out.println("Classic Wheat bread in making");
    }
}
