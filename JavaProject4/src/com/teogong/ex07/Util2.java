package com.teogong.ex07;

public class Util2 {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue(); // Number의 doubleValue() 메소드
		double v2 = t2.doubleValue(); // Number의 doubleValue() 메소드
		return Double.compare(v1, v2);
	}
}
