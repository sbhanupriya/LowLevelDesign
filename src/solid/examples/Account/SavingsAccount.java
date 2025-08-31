package solid.examples.Account;

public class SavingsAccount extends WithdrawableAccount{
    public SavingsAccount(Double amount){
       super(amount);
    }

    @Override
    public void deposit(Double tranaction) {
        System.out.println("Amount before depositing: "  + amount);
        amount += tranaction;
        System.out.println("Amount after depositing: "  + amount);
    }

    @Override
    public void withdraw(Double transaction) {
        System.out.println("Amount before withdrawing: "  + amount);
        amount -= transaction;
        System.out.println("Amount after withdrawing: "  + amount);

    }
}
