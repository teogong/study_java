package com.teogong.hello;

public class ForTest {
	public static void main(String[] args) {
		int num01 = 10;
		int num02 = 2;

//		num01++; //num01 = num01 + 1
//		System.out.println(num01);
//		++num01;
//		System.out.println(num01);
// ++xx이면 1을 먼저 더한다. xx++이면 1을 나중에 더한다.

		int result = num01 / num02++;
		System.out.println("result: " + result + ", num02:" + num02);

		num01 = num01 + 2;
		System.out.println(num01);

		num01 += 2;
		System.out.println(num01);

		// 1~100까지 더하기
		// 처음구동시 (1;2;3)이면 1,2,3이후 3 2 3 2 로 반복후 조건 만족시 끝
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);

		sum = 0;
		int i = 0;
		for (; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);

		sum = 0;
		i = 0;
		for (; i <= 100;) {
			sum += i;
			i++;
		}
		System.out.println("sum : " + sum);

//		for(;;) {
//			System.out.println("하하하");
//		}
		sum = 0;
		for (int k = 0; k <= 100; k += 2) {
			sum += k;
		}
		System.out.println("sum: " + sum);

		sum = 0;
		for (int k = 0, s = 100; k <= 100; k += 2, s++) {
			sum += k;
			System.out.println("s: " + s);
		}
		System.out.println("sum: " + sum);

//		int v1 = 15;
//		if (v1 > 10) {
//			int v2 = v1 - 10;
//		}
//		int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없기에 컴파일 에러 {}안에 있어야한다.
	}
}
