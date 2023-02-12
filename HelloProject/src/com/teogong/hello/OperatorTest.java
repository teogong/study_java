package com.teogong.hello;

public class OperatorTest {
	public static void main(String[] args) {
		int num01 = 10 * 7;
		System.out.println(num01);

		int num02 = 10 / 7;
		System.out.println(num02);
		// 정수 나누기 정수는 정수만 나온다 나머지는 안나온다.

		double num03 = 10.0 / 7;
		System.out.println(num03);

		int num04 = 10 % 7;
		System.out.println(num04);
		// %는 모듈러 연산자 흔히 나머지연산자로 불림

		num01 = 10;
		num02 = 10;

		if (num01 < num02) {
			System.out.println("num01 < num02");
			// 가독성을 위해 한줄이라도 sysout을 적어 두는것이 좋다.
		} else {
			System.out.println("num01 > num02");
			// 원하는 범위만큼 주석처리 하고 싶으면 원하는 만큼 잡고 ctrl+/
		}

		if (num01 > num02) {
			System.out.println("num01 > num02");
		} else if (num01 == num02) {
			System.out.println("num01 == num02");
		} else {
			System.out.println("num01 < num02");
		}

		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}
}
