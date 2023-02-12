package com.teogong.day02;

import java.util.Calendar;

public class WeekEndTest {
	public static void main(String[] args) {
	// week 열거 타입 변수 선언
	EnumTest today = null;
	// calendar 얻기
	Calendar cal = Calendar.getInstance();
	// 오늘의 요일 얻기(1~7)
	int week = cal.get(Calendar.DAY_OF_WEEK);
	// 숫자를 열거 상수로 변환해서 변수에 대입
	switch(week) {
		case 1: today = EnumTest.SUNDAY; break;
		case 2: today = EnumTest.MONDAY; break;
		case 3: today = EnumTest.TUESDAY; break;
		case 4: today = EnumTest.WENESDAY; break;
		case 5: today = EnumTest.THURSDAY; break;
		case 6: today = EnumTest.FRIDAY; break;
		case 7: today = EnumTest.SATURDAY; break;
	}
	// 열거타입 변수를 사용
	if(today==EnumTest.SUNDAY) {
		System.out.println("일요일에는 축구를합니다");
	} else {
		System.out.println("열심히 자바를 공부합니다");
		}
	}
}
