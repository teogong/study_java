package com.teogong.ex10;

import java.util.function.IntBinaryOperator;

public class OperatorTest {
private static int[] scores = {94, 96, 86, 77,65,435,75,5654,36547,534627,56,65,667,76573};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score: scores) {
			result = operator.applyAsInt(result,  score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int max = maxOrMin(
				(a, b) -> a >= b ? a: b
		);
		
		System.out.println("최대값: " + max);
		
		int min = maxOrMin(
				(a, b) -> {
					if( a <= b)
						return a;
					else
						return b;
				}
		);
		
		System.out.println("최소값: " + min);
			
	}
}
