package com.teogong.ex02;

public class Car {
	String company = "Hyundai";
	String model = "Sonata";
	int capacity = 5;
	String driver = "홍길동";
	
	//같은 car()이지만 파라미터가 있고 없고 차이가 있다. 생성자 overload이다.private는 호출X
	public Car() {
		
	}
	public Car(String driver) {
		this.driver = driver;
	}
	
	public Car(String driver, String model) {
		this(driver);
		this.model = model;
	}

	public void drive() {
		System.out.println(driver + "차 달린다");
	}

	public void stop() {
		System.out.println("멈춘다");

	}

	public void showMe() {
		System.out.println("Company : " + company);
		System.out.println("Model : " + model);
	}

	public int getCapacity() {
		return capacity;
	}

	public void whoAreYou() {
		System.out.println(this);
	}
}