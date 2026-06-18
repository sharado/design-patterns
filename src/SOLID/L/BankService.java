package SOLID.L;

public class BankService {

    public static void askService(Account account,double amount){
//        account.deposit(amount);

        if(account instanceof SavingAccount){
            SavingAccount account1 = (SavingAccount) account;
            account1.withdraw(amount);
            account1.deposit(amount);
        }
        else if(account instanceof CurrentAccount){
            CurrentAccount account1 = (CurrentAccount) account;
            account1.withdraw(amount);
            account1.deposit(amount);
        }
        else{
            account.deposit(amount);
        }

    }
}
