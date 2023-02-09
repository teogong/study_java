package com.teogong.ex03;

public class FlagGameThread01 {
	public static void main(String[] args) {
		Runnable flagTask = new FlafTask();
		Thread thread = new Thread(flagTask);
		thread.start();
		
		for( int i =0; i<10 ; i++) {
			System.out.println("청기");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
