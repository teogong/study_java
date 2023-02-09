package com.teogong.ex01;

public class Account {
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(long money) {
		balance += money;
	}
	
	public void withdraw(long money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔액부족");
		}
		balance -=  money;
	
	}
}
