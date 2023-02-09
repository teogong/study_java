package com.teogong.ex07_1;

public class Audio implements RemoteControl{
	private int volumn;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("|Audio On!|");
		System.out.println("============");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("|Audio Off!|");
		System.out.println("============");
	}

	@Override
	public void setVolumn(int volumn) {
		// TODO Auto-generated method stub
		if(volumn > RemoteControl.MAX_VOLUMN) {
			this.volumn = RemoteControl.MAX_VOLUMN;
		} else if(volumn > RemoteControl.MIN_VOLUMN) {
			this.volumn = RemoteControl.MIN_VOLUMN;
		} else {
			this.volumn = volumn;
		}
		System.out.println("현재 Audio 봄륨 : " + this.volumn);
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		if(mute) {
			 System.out.println("Audio 무음처리");
		 } else {
			 System.out.println("Audio 무음해제");
		 }
	} 
	
	
}
