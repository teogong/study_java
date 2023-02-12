package com.teogong.hello;

public class LogicalOperatiorTest {
	public static void main(String[] args) {
		int charCode = 'A';

		if ((65 <= charCode) & (charCode <= 90)) {
			System.out.println("대문자입니다.");
		}
		if ((97 <= charCode) && (charCode <= 122)) {
			System.out.println("대문자입니다.");
		}
		if ((48 <= charCode) && (charCode <= 57)) {
			System.out.println("대문자입니다.");
		}
// &보다 &&dl gydbfwjrdlek

		int value = 6;

		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 or 3의 배수입니다.");
		}
		boolean result = ((value % 2 == 0) | (value % 3 == 0));
		if (!result) {
			System.out.println("2 or 3의 배수가 아닙니다.");
		}
//정수(byte, short, int long)은 피연산자O, 실수(float, double)은 X
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("---------------------");

		byte receiveData = -120;

		// 방법1: 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);

		// 방법1: 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte)test;
		System.out.println(btest);
	}
}
