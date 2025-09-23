package designpatterns.behavioral.chainOfResponsibility.CashDispenser;

public class Demo {
    public static void main(String[] args){
        MoneyHandler handler = new ThousandHandler(3,new FiveHundredHandler(4, new OneHundredHandler(10,null)));

        int amountToWithdraw = 10000;
        handler.dispense(amountToWithdraw);
    }
}
