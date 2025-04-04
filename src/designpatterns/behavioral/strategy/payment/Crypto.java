package designpatterns.behavioral.strategy.payment;

public class Crypto implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Implementing Crypto Payments");
    }
}
