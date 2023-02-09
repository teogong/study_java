package com.teogong.ex04;

public class FlagTask extends Thread{

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
