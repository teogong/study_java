package com.teogong.hello;

public class IfTest {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6 + 1);

//		if (num == 1) {
//			System.out.println("1번");
//		} else if (num == 2) {
//			System.out.println("2번");
//		} else if (num == 3) {
//			System.out.println("3번");
//		} else if (num == 4) {
//			System.out.println("4번");
//		} else if (num == 5) {
//			System.out.println("5번");
//		} else if (num == 6) {
//			System.out.println("6번");
//		}
// if가 너무 많으면 난잡하고 고생이다 switch문으로 해결할수있다.

//		switch(num) {
//		case 1:
//			System.out.println("1번");
//			break;
//		case 2:
//			System.out.println("2번");
//			break;
//		case 3:
//			System.out.println("3번");
//			break;
//		case 4:
//			System.out.println("4번");
//			break;
//		case 5:
//			System.out.println("5번");
//			break;
//		default:
//			System.out.println("6번");
//		}
// 확장된 switch문
//		switch (num) {
//		case 1:
//		case 3:
//		case 5:
//			System.out.println("홀수");
//			break;
//		case 2:
//		case 4:
//		case 6:
//			System.out.println("짝수");
//		}
//		
		switch(num) {
		case 1, 3, 5 -> System.out.println("홀수");
		case 2, 4, 6 -> System.out.println("짝수");
		}
	}
}