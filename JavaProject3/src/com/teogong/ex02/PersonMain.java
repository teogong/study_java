package com.teogong.ex02;

public class PersonMain {
	public static void main(String[] args) {
		Student student = new Student("홍길동","111111-2222222",30);
		
		System.out.println("이름 : " + student.getName());
		System.out.println("이름 : " + student.getSsn());
		System.out.println("이름 : " + student.getStudenNo());
	}
}
