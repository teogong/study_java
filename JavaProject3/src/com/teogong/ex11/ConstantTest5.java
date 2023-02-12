package com.teogong.ex11;

public class ConstantTest5 {
	public static void main(String[] args) {
		// 서로 다른 타입이 달라서 못하게 막음
//		if (Day.MONDAY == Month.JANUARY) {
//			System.out.println("It's same!");
//		}
//		상수는 enum으로 쓰자
		Day day = Day.MONDAY;
// 		객체 레퍼런스는 스위치를 사용할수 없다.
		switch (day) {
		case MONDAY:
			System.out.println("It's Monday.");
			break;
		case TUESDAY:
			System.out.println("It's Tuesday.");
			break;
		case WEDNESDAY:
			System.out.println("It's Wednesday.");
			break;
		case THURSDAY:
			System.out.println("It's Thursday.");
			break;
		case FRIDAY:
			System.out.println("It's Friday.");
			break;
		case SATURDAY:
			System.out.println("It's Saturday.");
			break;
		default:
			System.out.println("It's Sunday.");
		}
	}
}
