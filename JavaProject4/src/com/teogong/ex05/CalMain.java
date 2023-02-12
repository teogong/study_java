package com.teogong.ex05;

public class CalMain {
	public static void main(String[] args) {
		//다수의 객체가 공용으로 만들어서 쓰는것을 공유 객체이다.
		Calculator calculator = new Calculator();
		
		User01 user01 = new User01();
		user01.setCalculator(calculator);
		user01.start();
		
		User02 user02 = new User02();
		user02.setCalculator(calculator);
		user02.start();
	}
}
