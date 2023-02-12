package com.teogong.ex06;

public class StopTest3 {
	public static void main(String[] args) {
		Thread thread = new PrintThread3();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		thread.interrupt();
	}
}
