package com.teogong.ex07_1;

//Television은 RemoteControl 인턴패이스에 구현클래스
public class Television implements RemoteControl{
	private int volumn;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("=========");
		System.out.println("|TV On!|");
		System.out.println("=========");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("=========");
		System.out.println("|TV Off!|");
		System.out.println("=========");
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
		System.out.println("현재 TV 봄륨 : " + this.volumn);
	} 
}
