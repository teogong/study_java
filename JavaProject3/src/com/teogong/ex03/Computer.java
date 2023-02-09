package com.teogong.ex03;

public class Computer extends Calculator{

	@Override
	public double areaCircle(double radius) {
		// TODO Auto-generated method stub
		System.out.println("Computer의 Method");
		return Math.PI * radius * radius;
	}
	
//	@Override
//	public double areaCircle(double radius) {
//		System.out.println("Computer의 Method");
//		return Math.PI * radius * radius;
//	}

	
	
}
