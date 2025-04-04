package designpatterns.behavioral.strategy.payment;

public class CreditCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Implementing Credit Card Payments");
    }
}
