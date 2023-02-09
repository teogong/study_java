package com.teogong.ex01;

public class AcconutMain {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("잔액 : " + account.getBalance() );
		
		try {
			account.withdraw(50000);
		} catch (BalanceInsufficientException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println();
			e.printStackTrace();
		}
	}
}
