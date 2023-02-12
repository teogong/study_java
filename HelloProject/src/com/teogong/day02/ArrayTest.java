package com.teogong.day02;

public class ArrayTest {
	public static void main(String[] args) {
		int[] scores = { 90, 90, 100, 75 };
//배열은 동일한 타입의 변수들로 이루어진 유한집합. 요소는 element, 가리키는위치는 index, index는 항상 0부터시작
//배열을 가지고 for문을 돌릴때는 배열.length이용하자.
//객체 = 데이터(필드) + 메소드
		int sum = 0;
		System.out.println("scores[0]: " + scores[0]);
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);

		// Enhanced for loop/ 확장 for문
		sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println(sum);

		int[][] classScore = { { 80, 90, 100 }, { 85, 85, 95 } };
		for (int i = 0; i < classScore.length; i++) {
			sum = 0;
			for (int k = 0; k < classScore.length; k++) {
				sum += classScore[i][k];
			}
			System.out.println(i + 1 + "번 학생의 총점: " + sum);
		}
	}
}
