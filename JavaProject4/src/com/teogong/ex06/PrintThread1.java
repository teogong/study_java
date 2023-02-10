package com.teogong.ex06;

public class PrintThread1 extends Thread {
	private boolean stop = false;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!stop) {
			System.out.println("Running!");
		}
		System.out.println("closing resources");
		System.out.println("thread terminated!");
	}
	
	
}
