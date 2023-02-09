package com.teogong.ex04;

public class FlagGameThread04 {
	public static void main(String[] args) {
		Thread thread = new FlagTask();
		thread .start();
		
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
