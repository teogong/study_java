package com.teogong.service;

import java.util.List;
import java.util.Scanner;

import com.teogong.dao.SakilaDao;
import com.teogong.model.TitleActor;

public class TitlesByActor implements DbTask {
	private Scanner scanner;

	public TitlesByActor(Scanner scanner) {
		this.scanner = scanner;
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Input First-name Last-name> ");
		String fullName = scanner.nextLine();
		String firstName = fullName.split("\\s+")[0];
		String lastName = fullName.split("\\s+")[1];
		
		SakilaDao dao = SakilaDao.INSTANCE;
		
		List<TitleActor> titles = dao.getTitleByActor(firstName,lastName);
		
		System.out.println("First Name        Last Name        Title               Release Year         Rental rate");
		System.out.println("=======================================================================================");
		
		if(titles.size() == 0) {
			System.out.println("No data found");
		}else {

			for(TitleActor title : titles) {
				System.out.printf("%10s    %10s     %20s       %5s                %.2f\n", 
						title.getFirstName(), title.getLastName(), title.getTitle(),
						title.getYear(), title.getRentalRate());
			}			
		}
		scanner.nextLine();
	}
	
	
	

}
