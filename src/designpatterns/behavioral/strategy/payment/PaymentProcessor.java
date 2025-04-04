package designpatterns.behavioral.strategy.payment;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;
    public PaymentProcessor(PaymentStrategy strategy){
        this.paymentStrategy = strategy;
    }
    public void setPaymentStrategy(PaymentStrategy strategy){
        this.paymentStrategy = strategy;
    }
    public void processPayments(){
        this.paymentStrategy.processPayment();
    }
}
