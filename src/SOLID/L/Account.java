package SOLID.L;

public interface Account {
    void deposit(double amount);
}

interface WithdrawableAccount{
    double withdraw(double amount);
}
