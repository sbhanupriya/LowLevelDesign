package designpatterns.behavioral.template;

public class PayToFriend extends PaymentHandler {
    @Override
    public boolean validate() {
        System.out.println("Pay to Friend validated");
        return true;
    }

    @Override
    public Double calculateFees() {
        System.out.println("Pay to Friend Fees Calculation");
        return 0.0;
    }

    @Override
    public boolean debitAmount() {
        System.out.println("Pay to Friend - Debit");
        return false;
    }

    @Override
    public boolean creditAmount() {
        System.out.println("Pay to Friend - Credit");
        return false;
    }
}
