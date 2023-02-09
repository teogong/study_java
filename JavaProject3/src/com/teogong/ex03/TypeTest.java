package com.teogong.ex03;

class A{}
class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}


public class TypeTest {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = e;
		A a4 = d;
		
		B b1 = d;
		C c1 = e;
		
//		B b2 = e;
//		C c2 = d;
	}
	
}
