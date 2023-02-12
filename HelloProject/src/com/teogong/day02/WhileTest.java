package com.teogong.day02;

public class WhileTest {
	public static void main(String[] args) {
		int i = 0, sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("sum: " + sum);
//사이즈가 정해졌을때는 for 사이즈가 정해지지 않았을경우에는 while이 용이하다.
//do while문
		i = 0;
		sum = 0;
		do {
			sum += i;
			i++;
		} while (i <= 100);
		System.out.println("sum: " + sum);
	}
}
