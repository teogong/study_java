package com.teogong.day02;

import java.util.Scanner;

public class ArrayClassTest {
	public static void main(String[] args) {
//7. 주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보시오(for이용)
//int[] array01 = { 1,5,3,8,2};
		int[] array01 = { 1, 5, 3, 8, 2 };
		int big = 0;
		for (int k = 0; k < array01.length; k++) {
			if (big < array01[k]) {
				big = array01[k];
			}
			System.out.println("최댓값 : " + big);
		}

//8. 주어진 배열 항목의 전체합과 평균을 구해 출력하는 코드를 작성하시오(for이용)
//int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int[][] array02 = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		double avg = 0.0;
		int count = 0;

		for (int i = 0; i < array02.length; i++) {
			for (int j = 0; j < array02[i].length; j++) {

				sum += array02[i][j];
				count++;
			}
			avg = sum / count;

			System.out.println("sum : " + sum);
			System.out.println("avg : " + avg);
		}
//9. while과 scanner와 nextLine()이용하여 최고점수 및 평균점수를 출력하는코드
		Scanner sc = new Scanner(System.in);
		boolean student = true;
		int[] student_score = null;
		int student_count = 0;

		while (student) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------------");
			System.out.println("선택> ");

			int select_no = sc.nextInt();

			if (select_no == 1) {
				System.out.print("학생수>");
				student_count = sc.nextInt();
				student_score = new int[student_count];
			} else if (select_no == 2) {
				System.out.println("점수입력>");
				for (int i = 0; i < student_score.length; i++) {
					System.out.print("점수[" + i + "]");
					student_score[i] = sc.nextInt();
				}
			} else if (select_no == 3) {
				for (int i = 0; i < student_score.length; i++) {
					System.out.println("점수[" + i + "]" + student_score[i]);
				}
			} else if (select_no == 4) {
				int max = 0;
				int sum1 = 0;
				double avg1 = 0;
				for (int i = 0; i < student_score.length; i++) {
					max = (max < student_score[i]) ? student_score[i] : max;
					sum1 += student_score[i];
				}
				avg = (double) sum1 / student_count;
				System.out.println("최고점수: " + max);
				System.out.println("평균: " + avg);
			} else if (select_no == 5) {
				student = false;
			}
		}
		System.out.println("프로그램 종료");
	} 
}