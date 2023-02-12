package com.teogong.ex05;

public class Earth {
	//변하지 않는 값은 final로 선언해도된다.
	public static final double EARTH_RADIUS = 6400;
	public static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
