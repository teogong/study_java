package com.teogong.ex09;

public class ConstantTest2 {
	private static final int MONDAY = 1;
	private static final int TUESDAY = 2;
	private static final int WEDNESDAY = 3;
	private static final int THIRSDAY = 4;
	private static final int FRIDAY = 5;
	private static final int SATERDAY = 6;
	private static final int SUNDAY = 7;
	
	public static void main(String[] args) {
		int day = 1;
		
		switch(day) {
		case MONDAY:
			System.out.println("It's, Monday");
			break;
		case TUESDAY:
			System.out.println("It's, Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("It's, Wednesday");
			break;
		case THIRSDAY:
			System.out.println("It's, Thirsday");
			break;
		case FRIDAY:
			System.out.println("It's, Frieday");
			break;
		case SATERDAY:
			System.out.println("It's, Saterday");
			break;
		default:
			System.out.println("It's, Sunday");
			break;
		}
	}
}
