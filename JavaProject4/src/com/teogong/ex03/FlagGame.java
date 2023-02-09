package com.teogong.ex03;

public class FlagGame {
	public static void main(String[] args) {
		for( int i =0; i<10 ; i++) {
			System.out.println("청기");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		for( int i =0; i<10 ; i++) {
			System.out.println("백기");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
