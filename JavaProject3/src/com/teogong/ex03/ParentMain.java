package com.teogong.ex03;

public class ParentMain {
	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.method1();
		parent.method2();
//		parent.method3();
		
		Child child = (Child)parent;
		child.method3();
		
		
	}
}
