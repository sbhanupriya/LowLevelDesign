package solid.examples.Account;

public abstract class DepositOnly {
    protected Double amount;
    public DepositOnly(Double amount){
        this.amount = amount;
    }
    public abstract void deposit(Double amount);
}
