package com.teogong.ex07;
//   선생님 코드
// 내가 부족한 부분 length활용, 메서드 활용  영역 부족
public class Lab9 {
	public static void main(String[] args) {
		double[][]findAvgInput={{5,4.5,6.8},{6,0,3.4},{7,8.4,2.3}};

		findAverage(findAvgInput);
	}

	public static void findAverage(double[][] array) {

		for(int row=0;row<array.length;row++){
			for (int column = 0; column < array[row].length; column++) {
				if (array[row][column] == 0) {
					array[row][column] = Math.max(getRowTotal(array, row) / array[row].length,
							getColumnTotal(array, column) / array.length);
				}
			}
		}
		for (double[] row : array) {
			for (double column : row) {
				System.out.printf("%2.1f  ", column);
			}
			System.out.println();
		}
	}

	public static double getRowTotal(double[][] array, int row) {
		double sum = 0.0;
		for (int column = 0; column < array[row].length; column++) {
			sum += array[row][column];
		}
		return sum;
	}

	public static double getColumnTotal(double[][] array, int column) {
		double sum = 0.0;
		for(int row=0;row<array.length;row++){
			sum += array[row][column];
		}
		return sum;
	}
}