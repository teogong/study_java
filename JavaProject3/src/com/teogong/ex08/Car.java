package com.teogong.ex08;

public class Car {
	private Engine engine;

//	생성자의 다양성
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		engine.runEngine();
	}
}	
