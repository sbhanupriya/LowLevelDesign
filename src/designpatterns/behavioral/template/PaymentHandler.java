package designpatterns.behavioral.template;

public abstract class PaymentHandler {

    public final void processPayment(){
        validate();
        calculateFees();
        debitAmount();
        creditAmount();
    }
    public abstract boolean validate();
    public abstract Double calculateFees();
    public abstract boolean debitAmount();
    public abstract  boolean creditAmount();
}
