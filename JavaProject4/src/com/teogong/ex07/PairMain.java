package com.teogong.ex07;

public class PairMain {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1,"Java");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1,"Java");
		
//		System.out.println(Util.<Integer, String>compare(p1, p2));
		System.out.println(Util.compare(p1, p2)); //<Integer, String> 생략가능
		
		Pair<String, String> p3 = new Pair<String, String>("홍길동","Java");
		Pair<String, String> p4 = new Pair<String, String>("이순신","Java");
		
		System.out.println(Util.compare(p3, p4));
	}
}
