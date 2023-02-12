package com.teogong.ex03;

public class Calculator {
	public double areaRectangle(double width) {
		return width * width;
	}
//생성자 오버로드는 다 같고 파라미터만 다른경우 오버로드된다. 라고 한다. 
	public double arearectangle(double width, double height) {
		return width * height;
	}
}
