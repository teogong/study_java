package com.teogong.ex02;

public class CarMain {
	public static void main(String[] args) {
		Car tesla = new Car("일론 머스크");
		tesla.drive();

		Car myCar = new Car("홍길동");
		myCar.drive();

		Car yourCar = new Car();
		yourCar.drive();
		
		Car car3 = new Car("이순신", "아이오닉6");
		car3.drive();
		car3.showMe();
	}
}
//자동변수는 {}벗어나면 바로 사라지지않고 heap메모리영역에 쓰레기주소로 있다가 cpu가 덜바쁠때 jvm이 없앤다.
//선 stack 후 heap 제거라고 봐도 된다