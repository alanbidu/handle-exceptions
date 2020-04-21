package model.entities;

import model.exceptions.InvalidValue;
import model.exceptions.InvalidWithdraw;
import model.exceptions.NotEnoughBalance;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account(int number, String holder, double balance, double withdrawLimit) throws InvalidValue {
		this.number = number;
		this.holder = holder;
		if(balance < 0 || withdrawLimit < 0) {
			throw new InvalidValue("Invalid value used!");
		}
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) throws InvalidValue {
		if(amount < 0) {
			throw new InvalidValue("Invalid value used!");
		}
		this.balance += amount;
	}
		
	public void withdraw(double amount) throws InvalidValue, InvalidWithdraw, NotEnoughBalance {
		if(amount < 0) {
			throw new InvalidValue("Invalid value used!");
		}
		if(amount > withdrawLimit) {
			throw new InvalidWithdraw("The amount exceeds withdraw limit");
		}else if(amount > balance) {
			throw new NotEnoughBalance("Not enough balance");
		}
		this.balance -= amount;
	}
}
