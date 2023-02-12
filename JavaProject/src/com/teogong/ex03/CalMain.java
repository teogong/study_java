package com.teogong.ex03;

public class CalMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();

		System.out.println("정사각형 면적: " + cal.areaRectangle(10));
		System.out.println("직사각형 면적: "+ cal.arearectangle(5, 10));
	}
}
