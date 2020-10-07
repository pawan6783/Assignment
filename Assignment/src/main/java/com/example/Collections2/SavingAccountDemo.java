package com.example.Collections2;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

class SavingAccount {
	private double accountBalance;
	private int accountID;
	private String accountHolderName;
	private boolean isSalaryAccount;
	
	public SavingAccount(double accountBalance, int accountID, String accountHolderName, boolean isSalaryAccount) {
		super();
		this.accountBalance = accountBalance;
		this.accountID = accountID;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public void deposit(double amount) {
		this.accountBalance = this.accountBalance + amount;
	}
	
	public void withdraw(int amount) {
		this.accountBalance = this.accountBalance + amount;
	}
	
}

public class SavingAccountDemo{
	public static void main(String[]args) {
		SavingAccount sa1 = new SavingAccount(10000, 101, "john", true);
		SavingAccount sa2 = new SavingAccount(5000, 105, "max", true);
		SavingAccount sa3 = new SavingAccount(50000, 104, "henry", false);
		SavingAccount sa4 = new SavingAccount(20000, 102, "levi", false);
		SavingAccount sa5 = new SavingAccount(25000, 103, "karla", true);
		
		List<SavingAccount> accountList = new ArrayList<>();
		accountList.add(sa1);
		accountList.add(sa2);
		accountList.add(sa3);
		accountList.add(sa4);
		accountList.add(sa5);
		
		System.out.println("List of acount records:");
		for(SavingAccount it : accountList) {
			System.out.println("AccountID: "+it.getAccountID()+" AccountHolder: "+it.getAccountHolderName()+" isSalaryAccount: "+it.isSalaryAccount()+" AccoutBalance: "+it.getAccountBalance());
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("accounts.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(accountList);
			oos.flush();
			oos.close();
			
			FileInputStream fis = new FileInputStream("accounts.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<SavingAccount> readlist = (ArrayList<SavingAccount>) ois.readObject();
			
			System.out.println("data read from file:");
			for(SavingAccount it : readlist) {
				System.out.println("AccountID: "+it.getAccountID()+" AccountHolder: "+it.getAccountHolderName()+" isSalaryAccount: "+it.isSalaryAccount()+" AccoutBalance: "+it.getAccountBalance());

				ois.close();
			}
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("File opening or closing error");
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("class not found");
		}
		
	}
}