package designpatterns.behavioral.template;

public class PayToMerchant extends PaymentHandler{
    @Override
    public boolean validate() {
        System.out.println("Pay to Merchant validated");
        return true;
    }

    @Override
    public Double calculateFees() {
        System.out.println("Pay to Merchant Fees Calculation");
        return 0.0;
    }

    @Override
    public boolean debitAmount() {
        System.out.println("Pay to Merchant - Debit");
        return false;
    }

    @Override
    public boolean creditAmount() {
        System.out.println("Pay to Merchant - Credit");
        return false;
    }
}
