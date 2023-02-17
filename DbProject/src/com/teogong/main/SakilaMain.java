package com.teogong.main;

import com.teogong.service.JobFactory;
import com.teogong.service.SakilaService;

public class SakilaMain {
	public static void main(String[] args) {
		SakilaService service = new SakilaService(new JobFactory());
		service.doWork();
	}
}


