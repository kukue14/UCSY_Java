package Revisions.Chapter13.BankAccount;

public class SavingsAccount extends BankAccount {
    SavingsAccount(String bankAccount, double balance) {
        super(bankAccount, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) System.out.println("The Minimum baleance of $100 is required");
        else super.withdraw(amount);
    }
}
