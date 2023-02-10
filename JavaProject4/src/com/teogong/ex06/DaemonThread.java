package com.teogong.ex06;

public class DaemonThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Running!");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}
