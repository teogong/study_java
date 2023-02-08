package com.teogong.ex01;

public class CarMain {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-100);
		System.out.println("속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("속도 : " + myCar.getSpeed());
	
//		boolean의 초기값은 false
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("속도 : " + myCar.getSpeed());
	}
}
