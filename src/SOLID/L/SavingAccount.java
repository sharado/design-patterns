package SOLID.L;

public class SavingAccount implements Account,WithdrawableAccount {
    @Override
    public double withdraw(double amount) {
        System.out.println("Amount withdrawn : " + amount);
        return amount;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Amount deposited : " + amount);
    }
}
