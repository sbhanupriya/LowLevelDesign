package designpatterns.behavioral.strategy.payment;

public class PaymentSimulator {
    public static void main(String[] args){
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCard());
        paymentProcessor.processPayments();
        paymentProcessor.setPaymentStrategy(new Crypto());
        paymentProcessor.processPayments();
        paymentProcessor.setPaymentStrategy(new Stripe());
        paymentProcessor.processPayments();
    }
}
