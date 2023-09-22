package Revisions.Chapter14.ExamRevisions.Part3;

import java.util.*;
		

class BankAccount {
	private String accountName;
	private String name;
	double balance;
	
	BankAccount (String accountName, String name, double balance) {
		this.accountName = accountName;
		this.name = name;
		this.balance = balance;
	}

	public double deposit(double amount) {
		return balance += amount;
	}

	public double withdraw(double amount) {
		if (balance < amount) System.out.println("Unsuitable amount!");	
		else balance -= amount;
		return balance;
	}
	
	public String getAccountName() {
		return accountName;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
}

class SavingAccount extends BankAccount {	
	
	SavingAccount (String accountName, String name, double balance) {
		super(accountName, name, balance);
	}
	
	public double withdraw(double amount) {
		if ((super.getBalance()- amount) < 100) System.out.println("Balance must be $100");
		else {
			if (super.getBalance() < amount) System.out.println("Enough Balance!");
			else super.balance -= amount;
//			super.withdraw(amount);
		}
		return super.getBalance();
	}
}

public class UserAccount {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount("A001", "Ku Kue", 10000);
		System.out.println("Account name : " + bankAccount.getAccountName());
		System.out.println("Person Name : " + bankAccount.getName());
		System.out.println("Current balance : " + bankAccount.deposit(5000));
		System.out.println("Current balance : " + bankAccount.withdraw(13000));
		System.out.println("Current balance : " + bankAccount.withdraw(3000));		

		SavingAccount savingAccount = new SavingAccount("A002", "Mg Mg", 12000);
		System.out.println("Account name : " + savingAccount.getAccountName());
		System.out.println("Person Name : " + savingAccount.getName());
		System.out.println("Current balance : " + savingAccount.deposit(5000));
		System.out.println("Current balance : " + savingAccount.withdraw(13000));
		System.out.println("Current balance : " + savingAccount.withdraw(50000));
		System.out.println("Current balance : " + savingAccount.withdraw(1000));
	}
}