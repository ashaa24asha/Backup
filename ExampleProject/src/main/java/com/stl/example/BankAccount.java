package com.stl.example;

public class BankAccount {
	private String Onwer;
	private double balance;
	
	public String getOnwer() {
		return Onwer;
	}
	public void setOnwer(String onwer) {
		Onwer = onwer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public double withDraw(int withDrawAmount)
	{
		if(withDrawAmount <= this.balance)
		{
			this.balance = this.balance - withDrawAmount ;
			return withDrawAmount;
		}
		return 0;
	}
	
	public double deposit(int depositAmount)
	{
		if(depositAmount > 0)
		{
			this.balance = depositAmount + this.balance;
			return depositAmount;
		}
		return 0;
	}
	public BankAccount(String Onwer, int startingBalance){
        this.Onwer = Onwer;
        this.balance = Math.max(startingBalance, 0);
    }
}
