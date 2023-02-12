package com.teogong.ex10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class StrudentMain {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 95, 80),
			new Student("이순신", 90, 85)
	);
	
	public static void printString(Function<Student, String> function) {
		for(Student student: list) {
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student: list) {
			System.out.println(function.applyAsInt(student));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생이름]");
		
//		Function<Student, String> f = t -> t.getName();
//		printString(f); //람다식 푼것
		printString(t -> t.getName());
		
		System.out.println("[영어점수]");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("[수학점수]");
		printInt(t -> t.getMathScore());
	}
}
