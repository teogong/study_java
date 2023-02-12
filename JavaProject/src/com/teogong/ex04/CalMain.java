package com.teogong.ex04;

public class CalMain {
	public static void main(String[] args) {
		double r = 5;
		System.out.println("Circle area: " + r * r * Calculator.pi);
		System.out.println(Calculator.plus(10, 20));
//		System.out.println(Calculator.minus(49, 20));
		
		Calculator cal = new Calculator();
		System.out.println(cal.minus(20,5));
		System.out.println(cal.plus(20,5));
		//static은 기울어진 필기체로 바뀐다.
	}
}
