package com.teogong.ex03;

public class StringTest {
	public static void main(String[] args) {
//		String s1 = "Hello"; //원래는 8번처럼 작성해야하나 매번 new String 하면 오래걸려서 생략이 가능하다.
//		System.out.println(s1);
//		
//		String s2 = new String("Java"); //기본자료형 이외에 자료형은 전부 객체이다
//		System.out.println(s2);
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		
		if (s1 == s2) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		if (s1 == s3) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		//문자열이 같은지 비교할때는 .equals를 이용하자.
		if(s1.equals(s3)) {
			System.out.println("s1.equals(s3)");
		} else {
			System.out.println("!s1.equals(s3");
		}
	}
}
