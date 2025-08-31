package solid.examples.Account;

public abstract class WithdrawableAccount extends DepositOnly {
    public WithdrawableAccount(Double amount){
        super(amount);
    }
    public abstract void withdraw(Double amount);
}
