package com.teogong.ex05;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "-출력");
	}
	
	
}
