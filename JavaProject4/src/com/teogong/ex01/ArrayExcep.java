package com.teogong.ex01;

public class ArrayExcep {
	public static void main(String[] args) {
		int[] arr = {1,2};
		
		try {
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
		} catch (Exception e) {
			System.out.println("인덱스 없음");
		}
		
		
		
	}
}
