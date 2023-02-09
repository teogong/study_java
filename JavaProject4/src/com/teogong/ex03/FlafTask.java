package com.teogong.ex03;

public class FlafTask implements Runnable{

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
	
}
