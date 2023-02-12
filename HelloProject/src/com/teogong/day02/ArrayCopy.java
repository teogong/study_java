package com.teogong.day02;

public class ArrayCopy {
	public static void main(String[] args) {
		//길이가 3인배열
		int[] oldIntArray = { 1, 2, 3, };
		//길이가 5인배열
		int[] newIntArray = new int[5];
		//배열항복복사
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		//배열항목출력
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}
}
