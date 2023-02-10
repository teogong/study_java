package com.teogong.ex05;

public class ThreadMain {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("main 메서드 실행 쓰레드: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("worker thread A: " + threadA.getName());
		threadA.start();
		
		ThreadA threadB = new ThreadA();
		System.out.println("worker thread B: " + threadB.getName());
		threadB.start();
	}
}
