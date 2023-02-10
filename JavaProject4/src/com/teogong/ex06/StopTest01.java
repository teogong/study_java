package com.teogong.ex06;

public class StopTest01 {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		printThread.setStop(true);
	}
}
