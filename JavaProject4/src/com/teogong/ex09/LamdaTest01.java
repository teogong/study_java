package com.teogong.ex09;

public class LamdaTest01 {
	public static void main(String[] args) {
		TestInterface t1 = new TestInterface() {
			
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("Hi!!!!!!!!!!!");
			}
		};
		t1.method();
		
		//람다식의 타켓 메소드는 추상메소드가 하나만 있어야한다. 익면구현객체를 만들때 람다식 사용한다. 
		t1 = () -> {System.out.println("Hello!!!!!!!!!!!");};
		
		t1.method();
		
		// 실행문이 하나만 있으면 {}를 안써도된다.
		t1 = () -> System.out.println("하하하!!!!!!!!!!!");
		t1.method();
	}//추상 메서드 하나있는 인터페이스에 익면구현객체를 간다하게 만드는것이 람다식
	//한만디로 줄이면 함수적 인터페이스(@FunctionalInterface)
}
