package com.teogong.ex07;

import com.teogong.ex02.Member;

public class BoxMain {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setObject("홍길동");
//		box.setObject(new Member("10")); //컴파일 타입에 타입 체크를 해준다
		String name = box.getObject();
		System.out.println(name);
		
//		box.setObject(new com.teogong.ex02.Member("10"));
//		자동 import 추가 컨트롤+시프트+O
		
		Box<Member> box2 = new Box<Member>();
 		box2.setObject(new Member("10"));
		Member member = box2.getObject();
		
		//Generic Programming
		// 장점 2가지
		//컴파일 타입에 타입 체크를 해준다
		// 강제 형변환 안해도된다
	}
}
