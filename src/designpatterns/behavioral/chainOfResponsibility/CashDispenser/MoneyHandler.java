package designpatterns.behavioral.chainOfResponsibility.CashDispenser;

public abstract class MoneyHandler {
    protected int notes;
    protected MoneyHandler nextHandler;
    public MoneyHandler(int count, MoneyHandler moneyHandler){
        this.nextHandler = moneyHandler;
        this.notes = count;
    }
    public abstract void dispense(int money);
}
