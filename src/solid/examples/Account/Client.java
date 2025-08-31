package solid.examples.Account;

import java.util.List;

public class Client {
    private List<DepositOnly> depositOnlyList;
    private List<WithdrawableAccount> withdrawableAccountList;
    public Client(List<DepositOnly> depositable, List<WithdrawableAccount> withdrawable){
        this.depositOnlyList = depositable;
        this.withdrawableAccountList = withdrawable;
    }

    public void transaction(){
        for(DepositOnly acc: depositOnlyList){
            acc.deposit(1000.0);
        }
        for(WithdrawableAccount acc: withdrawableAccountList){
            acc.deposit(1000.0);
            acc.withdraw(500.0);
        }
    }

}
