package com.teogong.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");
		set.add("SPring");
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
	}
}
