package com.teogong.ex06;

public class PrintThread2 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				System.out.println("Running!");
				// sleep 모드 있을때 InterruptedException를 받을수 있다.
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("closing resources");
		System.out.println("thread terminated!");
	}
	
}
