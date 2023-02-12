package com.teogong.ex03;

public class VarTest {
	public static void main(String[] args) {
		int num01 = 10;
		{
			int num02 = 20;
			System.out.println("inner num02: " + num02);
		}
		System.out.println("num01: " + num01);
//		System.out.println("num02: " + num02);
		
		for(int i = 0; i<3; i++) {
			
		}
//		System.out.println("i: "+ i);
	}
}
//cannot be resolved는 없는거에 접근하려고 할때 생성된다.
//{}를 벗어나면 없어진다. int num01=10; 은 전역변수라 어디서든 호출가능