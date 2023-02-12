package com.teogong.ex05;

public class Person {
	public final String nationality = "Korea";//final은 한번 참조시 다시 변경이 불가능하다. 선언시 값을 지정해야 error가 안난다.
	public final String ssn;//인스턴스는 this로 지정해주자
	public String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
}
