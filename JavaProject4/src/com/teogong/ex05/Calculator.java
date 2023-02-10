package com.teogong.ex05;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

//	User01:50
//	User02:50
//	실행결과가 덮어쓰기된다
	
//	synchronized 메소드
//	public synchronized void setMemory(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//		}
//		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
//	}
	
	
	
//	synchronized 블락
	public void setMemory(int memory) {
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
		
	}
	
}
