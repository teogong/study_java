package com.teogong.ex01;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();
		car.drive("홍길동");
		car.stop();
		car.showMe();
		int capacity = car.getCapacity();
		System.out.println(car.getCapacity());
		System.out.println("car:" + car);
		car.whoAreYou();
		System.out.println("==============================");
		
		Car car2 = new Car();
		car2.showMe();
		System.out.println("car:" + car2);
		car2.whoAreYou();
	}
	
}
