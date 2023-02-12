package com.teogong.ex06;

public class PrintThread3 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {
			System.out.println("Running!");
			// sleep 모드 있을때 InterruptedException를 받을수 있다.
			if (Thread.interrupted()) {
				break;
			}

		}
		System.out.println("closing resources");
		System.out.println("thread terminated!");
	}
}
