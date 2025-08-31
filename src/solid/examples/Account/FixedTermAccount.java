package solid.examples.Account;

public class FixedTermAccount extends DepositOnly{
    public FixedTermAccount(Double amount){
        super(amount);
    }

    @Override
    public void deposit(Double tranaction) {
        System.out.println("Amount before depositing: "  + amount);
        amount += tranaction;
        System.out.println("Amount after depositing: "  + amount);
    }
}
