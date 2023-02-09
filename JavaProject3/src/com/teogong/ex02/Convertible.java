package com.teogong.ex02;

public class Convertible extends Car{
	public Convertible(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void openRoof() {
		System.out.println("뚜껑 연다.");
	}
	
	public void closeRoof() {
		System.out.println("뚜껑을 닫는다.");
	}
}
