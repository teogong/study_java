package com.teogong.ex06;


// 데몬 쓰레드는 생성한 쓰레드가 죽으면 같이 죽는다
public class DaemonMain {
	public static void main(String[] args) {
		DaemonThread thread = new DaemonThread();
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
