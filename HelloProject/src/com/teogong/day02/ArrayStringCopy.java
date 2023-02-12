package com.teogong.day02;

public class ArrayStringCopy {
	public static void main(String[] args) {

		// 길이가 3인배열
		String[] oldStrArray = { "java", "array", "copy" };
		// 길이가 5인배열
		String[] newStrArray = new String[5];
		// 배열항복복사
		for (int i = 0; i < oldStrArray.length; i++) {
			newStrArray[i] = oldStrArray[i];
		}
		// 배열항목출력
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}
