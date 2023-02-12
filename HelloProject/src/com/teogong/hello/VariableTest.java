package com.teogong.hello;

public class VariableTest {
	public static void main(String[] args) {
		char char01 = 'A';
		//public static void main을 편하게 부르고 싶으면 main, ctrl+space
		System.out.println(char01);
		//항상 문장 끝에는 ;(세미콜론)을 붙인다.
		char01 = 65;
		System.out.println(char01);
		//sysout ctrl + space
		char01 = '\u0041';
		System.out.println(char01);

		int num01 = 100;
		int num02 = 50;
		int sum = num01 + num02;
		System.out.println(sum);

		double d01 = 23.567;
		double d02 = 41.998;
		System.out.println(d01 + d02);

		boolean b01 = true;
		System.out.println(b01);

		boolean b02 = 10 < 7;
		System.out.println(b02);

		String s01 = "Hello, ";
		String s02 = "World!!";
		System.out.println(s01 + s02 + "하하하");
		//문장전체 들여쓰기 검사는 ctrl+shift+f

		double sum01 = 12.6666 + num01;
		//서로다른 두 타입으로 연산을 할 경우 더 큰 타입으로 형변환이된다.
		System.out.println(sum01);
		// byte < short < int < long < float < double
	}
}
