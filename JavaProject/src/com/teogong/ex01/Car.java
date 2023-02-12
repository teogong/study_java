package com.teogong.ex01;

public class Car {
	String company = "Hyundai";
	String model = "Sonata";
	int capacity = 5;
	
	public void drive(String driver) {
		System.out.println(driver + "차 달린다");
	}
	public void stop() {
		System.out.println("멈춘다");
		
	}
	public void showMe() {
		System.out.println("Company : " + company );
		System.out.println("Model : " + model );
	}
	public int getCapacity() {
		return capacity;
	}
	public void whoAreYou() {
		System.out.println(this);
	}
}
