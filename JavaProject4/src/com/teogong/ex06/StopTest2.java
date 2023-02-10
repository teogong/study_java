package com.teogong.ex06;

public class StopTest2 {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		thread.interrupt();
	}
}
