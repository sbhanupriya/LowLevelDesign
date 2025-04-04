package designpatterns.behavioral.strategy.payment;

public class Stripe implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Implementing Stripe Payments");
    }
}
