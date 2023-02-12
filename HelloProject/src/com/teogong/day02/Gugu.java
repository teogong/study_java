package com.teogong.day02;

import java.util.Scanner;

//자동import는 ctrl+shift+o
//printf에는 %d,%s,%f,%c,%n,%b가 있고 정수형,문자형,실수형,문자열,줄개행,불린출력이다.
public class Gugu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 수 입력:");
		int a = sc.nextInt();

		System.out.print(a);

		for (int j = 1; j <= 9; j++) {
			System.out.print(a + " X " + j + " = " + a * j);
			System.out.println();

			for (int i = 1; i <= 9; i++) {
				for (int k = 2; k <= 9; k++) {
					System.out.printf("%d X %d = %2d ", k, i, (i * k));
				}
				System.out.println();
			}
		}
	}
}