package model.entities;

import model.exceptions.DomainException;

public class Account {

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public void withDraw(Double amount) {
		if (withDrawLimit < amount) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit!");
		}
		else if (amount > balance) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		balance -= amount;

	}
	
}
