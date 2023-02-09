package com.teogong.ex03;

public class FlagGameThread02 {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for( int i =0; i<10 ; i++) {
					System.out.println("백기");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		});
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
