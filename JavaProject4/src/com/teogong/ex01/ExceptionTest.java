package com.teogong.ex01;

public class ExceptionTest {
	public static void main(String[] args) {
		//일반 예외
		try {
			Class.forName("java.lang.Strinc");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch blockEx
			System.out.println("클래스 없다~~~~~~~");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
