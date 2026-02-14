package designpatterns.behavioral.template;

public class PaymentProcessDemo {
    public static void main(String[] args){
        PaymentHandler handler = new PayToFriend();
        handler.processPayment();
    }
}
