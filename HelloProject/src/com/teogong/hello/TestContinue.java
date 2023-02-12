package com.teogong.hello;

import java.util.Scanner;

public class TestContinue {
	public static void main(String[] args) {
//1. for문을 이용해서 1~100까지의 정수중에서 3의 배수의 총합을 출력하는 코드를 작성
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의배수의합은 " + sum + "입니다");
//2.
		while (true) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);

			if (num1 + num2 == 5) {
				break;
			}
		}

//3. 중첩for문을 이용하여 4x + 5y = 60의 모든해를 구해서 (x,y)형태로 출력하는 코드를 작성하시오(x,y는 10이하의 자연수)
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if ((4 * x + 5 * y) == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
//4. for문을 이용해서 다음과 같은 실행결과가 나오는 코드를 작성해보세요
		for (int l = 1; l <= 5; l++) {
			for (int o = 1; o <= l; o++) {
				if (l <= 5)
					System.out.print("*");
				if (o == l) {
					System.out.println();
				}
			}
		}

//5.while과 scanner의 nextline() 메소드를 이용하여 결과를 만드시오
		Scanner scanner = new Scanner(System.in);
		boolean bank = true;
		int balance = 0;

		while (bank) {
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.println("선택> ");

			int strNum = scanner.nextInt();

			switch (strNum) {
			case 1:
				System.out.print("예금액>");
				balance += scanner.nextInt();
				break;

			case 2:
				System.out.print("출금액>");
				balance -= scanner.nextInt();
				break;

			case 3:
				System.out.print("잔고>");
				System.out.println(balance);
				break;
			case 4:
				bank = false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}