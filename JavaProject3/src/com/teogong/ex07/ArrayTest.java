package com.teogong.ex07;

// 내 코드
public class ArrayTest {
	public static void main(String[] args) {
		double[][] findAvgInput={{5,4.5,6.8},{6,0,3.4},{7,8.4,2.3}};

		findAverage(findAvgInput);
	}
	
	public static void findAverage(double[][] array) {
		double sumRow = 0.0;
		double sumColumn = 0.0;
		double averageRow = 0.0;
		double averageColumn = 0.0;
		
		for(int i = 0; i<3;i++) {
			System.out.println();
			for(int j =0; j<3; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("================================");
		
		for(int i = 0; i<array.length;i++) {
			sumRow = 0;
			sumColumn = 0;
			System.out.println();
			for(int j =0; j<array.length; j++) {
				sumRow = array[j][0] + array[j][1] + array[j][2];
				sumColumn = array[0][i] + array[1][j] + array[2][j];
				if(array[i][j] == 0) {
					averageRow = sumRow/3;
					averageColumn = sumColumn/3;
					if(averageRow < averageColumn) {
						System.out.printf("%2.1f  ",averageColumn);
					} else {
						System.out.printf("%2.1f  ",averageRow);
					}
				} else {
				System.out.print(array[i][j] + "  ");	
				}
			}
		}
	}
}
