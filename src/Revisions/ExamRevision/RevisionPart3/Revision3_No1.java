package Revisions.ExamRevision.RevisionPart3;

import java.util.*;

class BankAccount {
	private String accountName;
	private String accountNumber;
	double balance;

	public BankAccount() {
		accountName = "Unknown";
		accountNumber = "Unknown";
		balance = 0.0;
	}

	public BankAccount(String accountName, String accountNumber, double balance) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public double deposit(double amount) {
		return balance += amount;
	}

	public double withdraw(double amount) {
		if (balance < amount) System.out.println("Not enought balance!");
		else {
			balance -= amount;
		}
		return balance;
	}

	public String getAccountName() {
		return accountName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
}

class SavingAccount extends BankAccount {

	public SavingAccount(String accountName, String accountNumber, double balance) {
		super(accountName, accountNumber, balance);
	}

	public double withdraw(double amount){
		if ((super.balance - amount) < 100) System.out.println("At least 100$ remained.");
		else {
			if (super.balance < amount) System.out.println("Not enough balance!");
			else super.balance -= amount;
		}
		return super.balance;
	}
}

public class Revision3_No1 {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount("Ku Kue", "A-0001", 100000);
		System.out.println("Name : " + bankAccount.getAccountName());
		System.out.println("Number : " + bankAccount.getAccountNumber());
		System.out.println("Balance : " + bankAccount.getBalance());
		System.out.println("Deposit : " + bankAccount.deposit(3000));
		System.out.println("Withdraw : " + bankAccount.withdraw(200000));

		SavingAccount SavingAccount = new SavingAccount("Ku Kue", "A-0001", 100000);
		System.out.println("Name : " + SavingAccount.getAccountName());
		System.out.println("Number : " + SavingAccount.getAccountNumber());
		System.out.println("Balance : " + SavingAccount.getBalance());
		System.out.println("Deposit : " + SavingAccount.deposit(3000));
		System.out.println("Withdraw : " + SavingAccount.withdraw(7000));
		System.out.println("Withdraw : " + SavingAccount.withdraw(7000));
	}
}