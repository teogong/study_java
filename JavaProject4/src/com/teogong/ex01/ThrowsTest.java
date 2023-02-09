package com.teogong.ex01;

public class ThrowsTest {
	public static void exceptTest() throws Exception {
		Class.forName("java.lang.string");
	}
	
	public static void main(String[] args) throws Exception{
//		try {
//			exceptTest();
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("오류 처리......");
//		}
		
		exceptTest();
	}
}
