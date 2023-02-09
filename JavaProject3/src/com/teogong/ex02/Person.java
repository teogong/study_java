package com.teogong.ex02;

public class Person {
	private String name;
	private String ssn;
	
//	public Person(String name, String ssn) {
//		this.name = name;
//		this.ssn = ssn;
//	}

	
	
	public String getName() {
		return name;
	}

	public Person(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}
	
	
	
	
}
