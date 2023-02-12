package com.teogong.ex04;

public class StaticTest {
	public int field1;// instance변수는 new로 생성 전에는 쓸수 없다.
	public void method1() {}
	public static int field2;// static변수는 빌드 될때 static구역에 빌드된다.
	public static void method2() {}
	static {
		field2 = 10;
		method2();
		// field1 = 10;
		// method1();
	}

	public static void method3() {
		field2 = 10;
		method2();
		// this.field2 = 20;//객체를 생성하지 않았기 때문에 this는 사용불가.
		// this.method2();
	}

	public static void method4() {
		StaticTest s = new StaticTest();
		s.field1 = 10;
		s.method1();
	}
	public static StaticTest object = new StaticTest();//바로 실행시켜줘야하기때문에 static에 바로 올라간다.
}
