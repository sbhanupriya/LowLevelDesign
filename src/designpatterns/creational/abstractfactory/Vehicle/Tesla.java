package designpatterns.creational.abstractfactory.Vehicle;

public class Tesla implements Vehicle{
    @Override
    public void average() {
        System.out.println("Tesla: Electric and futuristic.");
    }
}
