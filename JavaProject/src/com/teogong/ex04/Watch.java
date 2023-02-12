package com.teogong.ex04;

public class Watch {
	public static String company = "Rolex";
	public static String model = "Oyster Precision";
	public static String feature;
	
	//static 블럭을 지정하면 실행하고자하는 영역을 지정할수 있다
	static {
		feature = company + "-" + model + "limited edition";
	}
}
