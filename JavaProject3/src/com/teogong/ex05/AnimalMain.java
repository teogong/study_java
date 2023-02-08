package com.teogong.ex05;

public class AnimalMain {
	public static void main(String[] args) {
		Animal jindoDog = new Dog();
		Animal sparrow = new Bird();
		
		jindoDog.sound();
		sparrow.sound();
		System.out.println("===============================");
		animalSound(new Dog());
		animalSound(new Bird());
	}
	
//	static이 있는 이유는 main이  static영역에 있기때문이다
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
