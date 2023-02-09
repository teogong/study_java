package com.teogong.ex01;

public class CarJava {
	private String model = "Sonata";
	private String color = "";
	
	public void drive() {
		System.out.println("달린다.");
	}
	
	public void stop() {
		System.out.println("멈춘다.");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
