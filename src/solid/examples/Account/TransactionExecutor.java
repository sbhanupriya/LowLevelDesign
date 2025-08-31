package solid.examples.Account;

import java.util.ArrayList;
import java.util.List;

public class TransactionExecutor {
    public static void main(String[] args){

        List<DepositOnly> depositOnlyList = new ArrayList<>();
        depositOnlyList.add(new FixedTermAccount(1000.0));
        depositOnlyList.add(new FixedTermAccount(2000.0));

        List<WithdrawableAccount> withdrawableAccountList = new ArrayList<>();
        withdrawableAccountList.add(new SavingsAccount(1000.0));
        withdrawableAccountList.add(new CurrentAccount(2000.0));

        Client client = new Client(depositOnlyList,withdrawableAccountList);
        client.transaction();
    }
}
