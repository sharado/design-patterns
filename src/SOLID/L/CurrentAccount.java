package SOLID.L;

public class CurrentAccount implements Account,WithdrawableAccount{
    @Override
    public double withdraw(double amount) {
        System.out.println("Withdrawn" + amount);
        return (amount);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposited" + amount);
    }
}
