package Revisions.Chapter13.BankAccount;

public class BankAccount {
    private String bankAccount;
    private double balance;

    public BankAccount(String bankAccount, double balance) {
        this.bankAccount = bankAccount;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Unsuitable amount.");
    }

    public double getBalance() {
        return balance;
    }

}

