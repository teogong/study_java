package com.teogong.ex3;

public class CalMain {
	public static void main(String[] args) {
		int radius = 10;
		
		Calculator cal = new Calculator();
		System.out.println(cal.areaCircle(radius));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println(com.areaCircle(radius));
	}
}
