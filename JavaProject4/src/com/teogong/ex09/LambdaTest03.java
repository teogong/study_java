package com.teogong.ex09;

public class LambdaTest03 {
	public static void main(String[] args) {
		TestInterface03 t1 = (x,y) -> {return x + y;};
		System.out.println(t1.method(3, 4));
		
		//return으로 한줄 출력 할때 생략해서 써야한다.
		t1 = (x,y) -> x + y;
		System.out.println(t1.method(2, 8));
		
		t1 = (x,y) -> sum(x,y);
		System.out.println(t1.method(10,15));
	}
	public static int sum(int x, int y) {
		return x+y;
	}
}
