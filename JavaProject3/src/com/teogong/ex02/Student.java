package com.teogong.ex02;

public class Student extends Person{
	private int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	public int getStudenNo() {
		return studentNo;
	}
	
	
}
