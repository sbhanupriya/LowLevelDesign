package designpatterns.creational.abstractfactory.Food.concreteProduct;

public class ChesseWheatGarlicBread implements GarlicBread{
    @Override
    public void prepare() {
        System.out.println("Cheese Wheat bread in making");
    }
}
