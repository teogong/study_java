package com.teogong.ex05;

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person("111111-1212345", "홍길동");
		System.out.println(p.nationality);
		System.out.println(p.ssn);
		System.out.println(p.name);
		
//		p.nationality = "USA";
//		p.ssn = "888888-098987";
		p.name = "John";
	}
}
