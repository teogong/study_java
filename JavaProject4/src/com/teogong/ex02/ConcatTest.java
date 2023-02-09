package com.teogong.ex02;

public class ConcatTest {
	public static void main(String[] args) {
		String s1 = "My"; // My
		
		String s2 = s1 +" name"; // My name
		String s3 = s2 +" is";  // My name is
		String s4 = s3 +" Tom"; // My name is Tom
		System.out.println(s4);
		// 비효율적
		
		StringBuilder sb = new StringBuilder();
		sb.append("MY");
		sb.append(" name");
		sb.append(" is");
		sb.append(" Tom");
		System.out.println(sb.toString());
		System.out.println(sb.length());
		// 3개이상 붙일 경우 StringBuilder 사용하기
		
		StringBuffer sb2 = new StringBuffer(); // Thread safe ,사용방법은 StringBuilder같다
		
		
	}
}
