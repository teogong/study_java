package com.teogong.ex02;

public class MemberMain {
	public static void main(String[] args) {
		Member m1 = new Member("Java");
		Member m2 = new Member("Java");
		Member m3 = new Member("C++");
	
		if(m1.equals(m2)) {
			System.out.println("m1 == m2");
		} else {
			System.out.println("m1 != m2");
		}
		
		if(m1.equals(m3)) {
			System.out.println("m1 == m3");
		} else {
			System.out.println("m1 != m3");
		}
	}
}
