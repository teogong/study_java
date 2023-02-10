package com.teogong.ex09;

public class LambdaTest02 {
	public static void main(String[] args) {
		TestInterface02 t1 = (x) ->{
			int result = x * 10;
			System.out.println(result);
		};
		t1.method(2);
		t1 = (x) -> System.out.println(x * 10);
		t1.method(3);
	}
}
