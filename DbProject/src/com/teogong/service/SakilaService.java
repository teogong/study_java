package com.teogong.service;

import java.util.Scanner;

public class SakilaService {
	private Scanner scanner;
	private JobFactory factory;
	
	public SakilaService(JobFactory factory) {
		this.factory = factory;
	}
	
	public void doWork() {
		DbTask work = null;
		String inputString;
		scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Select Menu");
			System.out.println("===============================");
			System.out.println("a. Films by genre");
			System.out.println("b. Titles by actor");
			System.out.println("q. exit");
			System.out.println("> ");
			
			inputString = scanner.nextLine();
			
			work = factory.createJob(inputString, scanner);
			
			if(work != null) {
				work.getInfo();
				work = null;
			}
			System.err.println();
		}
		
	}
	
}
