package SOLID.L;

public class FixedDeposit implements Account{

    int month;

  /*  @Override
    public double withdraw(double amount) {
        if(month >= 60){
            System.out.println("Amount withdrawn : " + amount);
            return amount;
        }
        else{
            throw new RuntimeException("Cannot withdraw before 60 months");
        }
    }*/

    @Override
    public void deposit(double amount) {
        System.out.println("Amount Deposited : " + amount);
    }
}
