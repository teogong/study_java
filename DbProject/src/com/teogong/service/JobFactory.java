package com.teogong.service;

import java.util.Scanner;

public class JobFactory {
	public DbTask createJob(String job, Scanner scanner) {
		DbTask work = null;
		
		if(job.equals("a")) {
			work = new FilmsByGenre(scanner);
		}else if(job.equals("b")) {
			work = new TitlesByActor(scanner);
		} else if(job.equals("q")) {
			System.out.println();
			System.out.println("Program Terminated!!");
			scanner.close();
			System.out.println();
			System.exit(0);
		} else {
			System.out.println("Wrong selection!");
		}
		return work;
	}
}
